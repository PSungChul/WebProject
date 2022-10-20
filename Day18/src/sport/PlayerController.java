package sport;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {
	// 생성자 매개변수로 'PlayerRepository' 가져오기
	PlayerRepository playerRepository;
	public PlayerController(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	// 선수 영입 메소드
	// 1) Player 가짜 객체 'player'를 만들어서
	// 2) repository.save(player)
	void scout(Player player) {
		playerRepository.save(player);
	}
	
	// 선수 테이블 전체 조회(출력)
	void info() {
		List<Player> res = playerRepository.findAll();
		
		for ( int i = 0; i < res.size(); i++ ) {
			System.out.println(
					res.get(i).getIndex() + " "
					+ res.get(i).getName() + " "
					+ res.get(i).getPlayerNum());
		}
	}
}
