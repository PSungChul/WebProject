package codingtest;

import java.util.Scanner;

public class Subway {
	public static void main(String[] args) {
		String station[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int time[] = {2, 3, 2, 1, 2, 2, 3, 3, 1};
		Scanner sc = new Scanner(System.in);
		String st1 = sc.next();
		String st2 = sc.next();
		for( int i = 0; i < station.length; i++ ) {
			if( st1.equals(station[i]) ) {
				for( int j = 0; j < station.length; j++ ) {
					if( st2.equals(station[j]) ) {
						
					}
				}
			}
		}
	}
}
