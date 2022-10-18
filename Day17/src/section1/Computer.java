package section1;

public class Computer {
	// 기본 생성자
	public Computer() {
		
	}
	
	Speaker s;
	public Computer(Speaker s) {
		this.s = s;
	}
	
	void turnOn() {
		System.out.println("컴퓨터가 켜졌습니다.");
		s.turnOn();
	}
}
