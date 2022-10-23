package codingtest;

public class Solution1 {
	public int solution(int n) {
        int answer = 0;
        for ( int i = 1; i <= n; i++ ) {
        	if( n % i == 0 ) {
        		answer += i;
        	} else {
        		continue;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution1 sol1 = new Solution1();
		int ans = sol1.solution(12);
		System.out.println(ans);
	}
}
