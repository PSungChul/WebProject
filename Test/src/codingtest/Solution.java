package codingtest;

public class Solution {
	public int[] solution(int []arr) {
        for( int i = 0; i < arr.length-1; i++ ) {
        	if( arr[i] == arr[i+1] ) {
        		arr[i+1] = arr[i+2];
        		i--;
        	}
        }
        
        int answer[] = new int[arr.length];
        for( int i = 0; i < arr.length; i++ ) {
        	answer[i] = arr[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int arr[] = {4, 4, 4, 3, 3};
		int ans[] = sol.solution(arr);
		for( int i = 0; i < ans.length; i++ ) {
			System.out.print(ans[i] + " ");
		}
	}
}
