package test;

public class ClassA {
	public static void main(String[] args) {
		ClassB b1 = new ClassB(); // ClassB 객체 생성
		System.out.println(b1.x); // 객체를 이용하여 ClassB의 전역변수 호출
		System.out.println(ClassB.z); // ClassB를 이용하여 정적변수 호출
		//b1.methodB.z <-- 이건 불가능
		b1.methodB(); // 객체를 이용하여 ClassB의 메소드를 호출
	}
}


class ClassB {
	int x = 10; 		// 객체 변수 = 전역 변수 = "필드 변수"
	static int z = 10; // 정적 변수 = 전역 변수 = "클래스 변수"
	
	void methodB() { // 메소드
		int y = 30; 	// "지역 변수" = 밖에서 접근 불가
	}
}