package codingtest;

public class Solution3 {
	public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for( int i = 0; i < s.length(); i++ ) {
        	answer += Character.getNumericValue(s.charAt(i));
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 sol3 = new Solution3();
		int ans = sol3.solution(123);
		System.out.println(ans);
	}
}
