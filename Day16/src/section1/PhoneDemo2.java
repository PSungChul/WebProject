package section1;

abstract class Phone {
	abstract void turnOn();
}

class SamsongPhone extends Phone {
	@Override
	void turnOn() {
		System.out.println("삼성폰이 켜졌습니다.");
	}
}

class LZPhone extends Phone {
	void turnOn() {
		System.out.println("엘지폰이 켜졌습니다.");
	}
}

class Person {
	Phone phone;
	
	void buyPhone(Phone phone) {
//		phone = new LZPhone(); // 폰을 내 손으로 만듦
		this.phone = phone;
		System.out.println("야호 나 폰 샀다.");
	}
	
	void phoneOn() {
		phone.turnOn();
	}
}

public class PhoneDemo2 {
	public static void main(String[] args) {
		Person p = new Person();
		Phone phone = new LZPhone();
		p.buyPhone(phone);
		p.phoneOn();
		
		Phone sphone = new SamsongPhone();
		p.buyPhone(sphone);
		p.phoneOn();
	}
}
