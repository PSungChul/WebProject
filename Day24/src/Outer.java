
public class Outer {
	
	private String field1;
	private String field2;
	private String field3;
	// 빌더
	private Outer(String field1) {
		this.field1 = field1;
	}
	
	public static class Inner {
		
		String field1;
		
		Inner(String field1) {
			this.field1 = field1;
		}
		
		public Outer method() {
			Outer o = new Outer(field1);
			return o;
		}
		
	}
	// 생성자
//	public Outer(String field1) {
//		this.field1 = field1;
//	}
//	
//	public Outer(String field1, String field2) {
//		this(field1); // 이 객체가 가진 생성자 중에 이 매개변수를 받을 수 있는 생성자
//		this.field2 = field2;
//	}
//	
//	public Outer(String field1, String field2, String field3) {
//		this(field1, field2);
//		this.field2 = field3;
//	}
	
	@Override
	public String toString() {
		return field1 + " " + field2 + " " + field3;
	}
	
	void outMethod() {
		System.out.println(this.toString());
	}
}
