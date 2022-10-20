package sport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerRepository {
	// 가짜 DB Map<key, value>
	// 순서가 없을때 = foreach문 / while문
	Map<Integer, Player> db = new HashMap<Integer, Player>();
	
	void save(Player player) {
		db.put(player.getIndex(), player);
		System.out.println(player.getName() + " 선수 영입 완료"); // 확인용 메세지
	}
	
	List<Player> findAll() {
		List<Player> result = new ArrayList<Player>();
		
		for (Integer key:db.keySet()) { // key값으로 foreach문 돌리기
			// for (each:덩어리)
			result.add(db.get(key)); // value값 List에 넣기
		}
		
		return result;
	}
}
