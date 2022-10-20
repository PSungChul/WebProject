package dbconnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB connection, select, insert
 * @author p._.sc
 * 
 */
public class DBconn { // DB 연결 전용 클래스
	// 아무나 접근을 못하게 private로 만들어 주는게 좋다.
	private Connection conn; // 자바와 DB를 연결해줄 통로
	private Statement stmt; // sql을 감싸주는 캡슐 - 기본
	private PreparedStatement pstmt; // sql을 감싸주는 캡슐 - 준비된
	private ResultSet rs; // 값을 받는 용도
	
	String url = "jdbc:mysql://localhost:3306/test"; // mysql "test" DB 주소
	// DB 통로 생성 및 연결
	public DBconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql-DBconnector 라이브러리의 Driver 클래스 파일 이름
			System.out.println("Driver 로딩 성공"); // 확인용 메세지
			
			conn = DriverManager
					.getConnection(url, "root", ""); // 연결 시작
			System.out.println("DB 접속 성공"); // 확인용 메세지
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // DBconn() DB연결
	
	/**
	 * testTable 테이블 데이터 입력
	 */
	public void save(int id, String name) {
		try {
			String sql = "INSERT INTO testTable VALUES(?, ?)"; // jdbc에서는 값을 바로 넣을 수 없기에 먼저 ?로 해놓고 아래에서 입력을 해준다.
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id); // 1번 ?에 id를 넣어줌
			pstmt.setString(2, name); // 2번 ?에 name을 넣어줌
			
			pstmt.executeUpdate(); // 이것을 입력해야 비로소 넘어가서 입력된다.
			System.out.println("DB 저장 성공");
			
			pstmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // save(id, name) INSERT
	
	/**
	 * testTable 테이블 전체 조회
	 */
	public void findAll(int id, String name) {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM testTable");
			
			while(rs.next()) { // 다음 행 있어?
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // findAll(id, name) SELECT
	
	public void disconnect() { // conn은 모두가 동등하게 사용하기에 나중에 모두 다 사용했을때 main에서 호출해서 종료시켜준다.
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBconn db = new DBconn();
		db.findAll(1, "tester1");
		db.disconnect();
	} // main
} // DBconn