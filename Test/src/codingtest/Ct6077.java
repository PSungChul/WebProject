package codingtest;

import java.util.Scanner;

public class Ct6077 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		int s = 0;
		for( int i = 1; i <= n; i++ ) {
			if( i%2 == 0 ) {
				s += i;
			}//if
		}//for
		System.out.println(s);
	}
}
