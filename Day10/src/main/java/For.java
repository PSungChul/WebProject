public class For {
	public static void main(String[] args) {
		int arr[] = new int[10];
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = (i+1)*100;
			System.out.println(arr[i]);
		}
		
	}
}
