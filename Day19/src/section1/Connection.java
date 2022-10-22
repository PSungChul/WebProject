package section1;

public class Connection {
	private int num = 0; // 필드 = 객체가 각각 가지는 변수
	private static Connection init = null;
	
	static public Connection get() {
		if(init == null) {
			init = new Connection();
		}
		
		return init;
	}
	
	public void count() {
		num++;
	}
	
	public int getNum() {
		return num;
	}
}
