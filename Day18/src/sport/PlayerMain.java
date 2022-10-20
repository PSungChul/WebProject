package sport;

public class PlayerMain {
	public static void main(String[] args) {
		PlayerRepository pr = new PlayerRepository();
		PlayerController pc = new PlayerController(pr);
		Player son = new Player(1, "son", 7); // Player 객체 데이터 추가
		Player song = new Player(2, "songa", 9); // Player 객체 데이터 추가
		pc.scout(son);
		pc.scout(song);
		pc.info();
	}
}
