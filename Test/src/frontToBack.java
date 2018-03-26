
public class frontToBack {
	String str = "test";

	public String front22(String str) {
		// change str from string to a charArry
		char[] newStr = str.toCharArray();
		// create a charArray as a destination for getChar
		char[] almostStr = newStr;
		// get chars from position 0 and 1
		str.getChars(0, 2, almostStr, 0);
		String finalStr = String.valueOf(almostStr);
		return finalStr;

	}

}
