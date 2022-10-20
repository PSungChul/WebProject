package sport;
/**
 * DTO
 * DB에서 데이터(1행) 읽어오면 들고다닐 수 있는 객체
 * 사용자에게 입력 받아서 생성된 데이터를 들고 다니는 객체
 * "데이터를 들고 다니는 객체"
 * 1) 데이터 베이스 1행 운반
 * 2) 여러 데이터들을 하나의 객체로 감싸서 운반
 * 3) 정보 은닉
 */
public class Player {
	// 선수 정보
	// 보안을 위한 private
	private int index; // index
	private String name; // 선수 이름
	private int playerNum; // 선수 번호
	// 생성자 오버로딩을 통한 데이터값 입력
	public Player(int index, String name, int playerNum) {
		this.index = index;
		this.name = name;
		this.playerNum = playerNum;
	}
	
	// getter
	int getIndex() {
		return index;
	}
	
	String getName() {
		return name;
	}
	
	int getPlayerNum() {
		return playerNum;
	}
}
