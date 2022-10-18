package section1;

public class Person {
	Computer c; // == Computer c = new Computer(s);
	
	Person(Computer c) { // == Computer c = new Computer(s);
		this.c = c;
		// this 는 객체 자기 자신
	}
	
	void turnOn() {
		c.turnOn();
	}
}
