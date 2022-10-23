package codingtest;

public class Solution4 {
	public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if( sqrt - (int)(sqrt) != 0 ) {
        	answer = -1;
        } else {
        	answer = (long)((sqrt+1)*(sqrt+1));
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution4 sol4 = new Solution4();
		long ans = sol4.solution(3);
		System.out.println(ans);
	}
}
