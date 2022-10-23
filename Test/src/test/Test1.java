package test;
/*
 * #콜바이레퍼런스
 * #콜바이벨류 (Call By Value)
 */
class ClassAA {
	void seven(int num) {
		num = num + 7;
	}
	
	void methodA() {
		int a = 3;
		seven(a);
		System.out.println(a);
	}
}

public class Test1 {
	public static void main(String[] args) {
		ClassAA classA = new ClassAA();
		classA.methodA();
	}
}
