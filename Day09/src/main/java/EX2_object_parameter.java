class Phone {
	String brand;
	
	Phone(String brand) {
		this.brand = brand;
	}
	
	void getBrand() {
		System.out.println(brand);
	}
}

class Person {
	String name = "sungchul";
	
	void buyPhone(Phone p) {
		System.out.println("제 명의(" + name + ")로" + p.brand + "폰을 샀습니다.");
	}
}

public class EX2_object_parameter {
	public static void main(String[] args) {
		Phone phone = new Phone("Samsong");
		phone.getBrand();
		
		Person person = new Person();
		person.buyPhone(phone);
	}
}
