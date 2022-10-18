package section1;

public class Demo {
	public static void main(String[] args) {
		Computer c1 = new Computer(); // new가 없으면 일반 메서드가 되므로 생성자로 만들려면 new가 필요하다.
		// 생성자의 역할
		// : 객체를 생성 "메모리에 올려서" 사용 할 준비를 마치는 것
		
		Speaker s = new Speaker();
		
		Computer c = new  Computer(s);
		c.s.name = "mashall";
		
		Computer c2 = new  Computer(s);
		System.out.println(c2.s.name);
		
		Computer c3 = new  Computer(s);
		System.out.println(c3.s.name);
		
		System.out.println(c2==c3); // 주소값 비교
		System.out.println(c2.equals(c3)); // 값 비교
		
		Person people = new Person(c);
		people.turnOn();
	}
}
