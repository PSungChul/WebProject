package codingtest;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 시
		int m = sc.nextInt(); // 분
		String time = ""; // 알람시간 h = 1 ~ 12 기준으로 AM과 PM으로 분류
		
		if ( 0 <= h && h <= 11 ) { // 새벽 0시부터 아침 11시까지
			if ( m < 15 ) { // 0분 ~ 14분
				h -= 2;
				m += 45;
				time = "AM";
			} else { // 15분 ~ 59분
				h--;
				m -= 15;
				time = "AM";
			}
			if ( h <= 0 ) { // 알람시간 h가 0이나 -가 된 경우
				h += 12;
				time = "PM";
			}
		} else if ( 12 <= h && h <= 23 ) { // 낮 12시부터 밤 23시까지
			if ( m < 15 ) { // 0분 ~ 14분 
				h -= 14;
				m += 45;
				time = "PM";
			} else { // 15분 ~ 59분
				h -= 13;
				m -= 15;
				time = "PM";
			}
			if ( h <= 0 ) { // 알람시간 h가 0이나 -가 된 경우
				h += 12;
				time = "AM";
			}
		}
		
		System.out.println(time + " " + h + " " + m); // 출력
		
	} // main
} // Main
