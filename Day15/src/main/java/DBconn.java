import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DB connection, select, insert
 * @author p._.sc
 * 
 */
public class DBconn {
	Connection conn; // 자바와 DB를 연결해줄 통로
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url = "jdbc:mysql://localhost:3306/test";
	
	DBconn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver 로딩 성공");
			
			conn = DriverManager
					.getConnection(url, "root", "46281379");
			System.out.println("DB 접속 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // DBconn() DB연결
	
	public void save(int id, String name) {
		try {
			String sql = "INSERT INTO testTable VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, id); // 1번 ?에 id를 넣어줌
			pstmt.setString(2, name); // 2번 ?에 name을 넣어줌
			
			pstmt.executeUpdate();
			System.out.println("DB 저장 성공");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBconn db = new DBconn();
		db.save(1, "tester1");
	} // main
} // DBconn