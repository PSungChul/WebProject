package test;

class ProtectedClass {
	protected String name = "";
}

public class ProtectedTest {
	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedClass();
		System.out.println(pc.name);
	}
}
