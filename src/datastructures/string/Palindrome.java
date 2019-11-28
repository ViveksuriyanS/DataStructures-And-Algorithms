package datastructures.string;

public class Palindrome {

	public static void main(String[] args) {
		String inp1 = "ababa";
		boolean result = checkPalindrome(inp1);
		System.out.println(result ? "Palindrome" : " Not palindrome");
	}

	public static boolean checkPalindrome(String inp1) {
		int startIndex = 0;
		int lastIndex = inp1.length() - 1;
		if (inp1.length() == 1) {
			System.out.println("The length of the string is 1");
			return true;
		}
		while (startIndex < lastIndex) {
			if (inp1.charAt(startIndex) == inp1.charAt(lastIndex)) {
				startIndex++;
				lastIndex--;
			} else {
				return false;
			}
		}

		return true;
	}

}
