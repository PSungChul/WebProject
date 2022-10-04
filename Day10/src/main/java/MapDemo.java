import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> sungchul = new HashMap<String, String>();
		sungchul.put("이름", "박성철");
		sungchul.put("성별", "남");
		sungchul.put("도시", "경기");
		sungchul.put("키", "200");
		System.out.println(sungchul);
	}
}
