package codingtest;

public class Solution2 {
	public double solution(int[] arr) {
        double answer = 0;
        int n = 0;
        for( int i = 0; i < arr.length; i++ ) {
        	n += arr[i];
        }
        answer = (double)n / arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int ar[] = {1,2,3,4};
		double db = sol2.solution(ar);
		System.out.println(db);
	}
}
