class Fruit {
	String name = "과일";
	
	void printColor() {
		System.out.println("색깔");
	}
}

class Apple extends Fruit{
	// printColor() override를 하기전까진 printColor()는 부모인 Fruit꺼지만,
	//				override를 하는순간 자식인 Apple이 가져가게 된다.
	String name = "사과"; // 상속관계에서 같은 이름의 변수가 있으면 우선순위는 자식클래스가 더 높다.
	
	@Override
	void printColor() {
		System.out.println("빨간색");
	}
	
	void eat() {
		System.out.println("아이 맛있어");
	}
}

public class EX4 {
	public static void main(String[] args) {
		Fruit b = new Apple(); // 업캐스팅 : 자식클래스가 부모클래스로 이동
		//Apple c = (Apple) new Fruit // 다운캐스팅 : 부모클래스가 자식클래스로 이동
		Apple a = new Apple();
		System.out.println(a.name);
		a.printColor(); // 업캐스팅은 Fruit의 메서드는 사용가능하지만,
		a.eat(); 		// 객체이름이 다른 Apple의 능력은 사용 불가능하다.
	}//main
}
