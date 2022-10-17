//package section1;
//
//abstract class Phone {
//	abstract void turnOn();
//}
//
//class SamsongPhone extends Phone {
//	
//	@Override
//	void turnOn() {
//		System.out.println("삼성폰이 켜졌습니다");
//	}
//}
//
//class LZPhone extends Phone {
//	
//	@Override
//	void turnOn() {
//		System.out.println("엘지폰이 켜졌습니다");
//	}
//}
//
//// 객체용 클래스
//class Person {
//	void buyPhone(Phone p) {
//		p.turnOn();
//	}
//}
//
//// 실행용 클래스
//public class PhoneDemo {
//	public static void main(String[] args) {
//		// 프로그램의 시작과 끝
//		
//		// 객체용 클래스 호출
//		Person person = new Person();
//		Phone phone = new LZPhone();
//		person.buyPhone(phone);
//	} // main
//}
