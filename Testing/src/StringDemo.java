
public class StringDemo {
	public static void main(String[] args) {
		String s = "Welcome to Java!";
		String s2 = "Michael is awesome !";
		//number of characters in this string
		System.out.println(s.length());
		//character at index 3
		System.out.println(s.charAt(3));
		//character at index 0
		System.out.println(s.charAt(0));
		//concatenate two string
		System.out.println(s + s2);
		//concatenate two strings using .concat() method
		System.out.println(s.concat(s2));
		

		
	}
}
