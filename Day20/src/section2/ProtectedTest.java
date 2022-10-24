package section2;

class ProtectedClass {
	protected String name = "protected는 같은 패키지 혹은 패키지가 상속관계일때 가능하다.";
}

public class ProtectedTest {
	public static void main(String[] args) {
		ProtectedClass pc = new ProtectedClass();
		System.out.println(pc.name);
	}
}
