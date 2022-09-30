public class EX1 {
	public static void main(String[] args) {
		
		/*
		 * 예제 1-1. 100 미만 3의 배수 정수들의 합
		 * i%3==0 을 사용하지 않고 방법이 있을까요?
		 */
		int sum = 0;
		
		for( int i = 0; i < 100; i+=3 ) {
			sum += i;
		}
		
		System.out.println(sum);
		
		/*
		 * 예제 1-2. 
		 */
		int score = 77;
		
		//if 방법
		if( score >= 80 ) {
			System.out.println("B");
		} else if( score >= 75 ) { // && score < 80
			System.out.println("C+");
		} else if ( score >= 70 ) { // && score < 75
			System.out.println("C");
		}
		
		//switch 방법
		switch( score / 10 ) {
		
		}
	}//main
}
