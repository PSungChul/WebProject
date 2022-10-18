package section1;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "apple"; // --> [a][p][p][l][e]
		String s2 = "apple"; // --> [a][p][p][l][e]
		String s3 = new String("apple");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
	}
}
