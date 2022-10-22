package section1;

public class Test {
	public static void main(String[] args) {
		
		Connection c1 = Connection.get();
		c1.count(); // 1
		
		Connection c2 = Connection.get();
		c2.count(); // 2
		
		Connection c3 = Connection.get();
		c3.count();
		
		System.out.println(c1.getNum());
		System.out.println(Connection.get().getNum());
		
//		Connection c1 = new Connection();
//		System.out.println(c1.get());
//		c1.count();
//		System.out.println(c1.getNum()); // 1
//		System.out.println(c1.get().getNum()); // 0
//		c1.get().count();
//		System.out.println(c1.get().getNum()); // 1
//		
//		Connection c2 = new Connection();
//		c2.get().count();
//		System.out.println(c2.get().getNum()); // 1 --> (static Connection) 2
		
//		Connection c1 = new Connection();		
//		c1.count();
//		c1.count();
//		c1.count();
//		c1.count();
//		c1.count();
//		System.out.println(c1.getNum()); // 5
//		
//		Connection c2 = new Connection();
//		c2.count();
//		c2.count();
//		System.out.println(c2.getNum()); // 2 --> (static) 7
	}
}
