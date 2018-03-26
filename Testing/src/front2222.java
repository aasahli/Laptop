

public class front2222 {
	public static void main(String[] args) {
	//create string
	String str = "Bolder";
	// change str from string to a charArry
	char[] newStr = str.toCharArray();
	// create a charArray as a destination for getChar
	char[] almostStr = new char[6];
	// get chars from position 3 and 4 and place them at the beginning of almostStr
	str.getChars(4, 6, almostStr, 0);
	//turn almostStr into a string from a charArray
	String theStr = String.valueOf(almostStr);
	
	System.out.print(theStr + str);

	
	}
}