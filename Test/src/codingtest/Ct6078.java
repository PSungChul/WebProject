package codingtest;

import java.util.Scanner;

public class Ct6078 {
	public static void main(String[] args) {
		boolean b = true;
		while(b) {
			Scanner sc = new Scanner(System.in);
			String c = sc.next();
			if( c.equals("q") ) {
				b = false;
			}
		}
	}
}
