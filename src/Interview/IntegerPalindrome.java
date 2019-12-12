package Interview;

public class IntegerPalindrome {

	public static void main(String[] args) {
		checkPalindrome(12345); // answer should be 54321
	}

	private static void checkPalindrome(int input) {
		int reverse = 0;
		while (input != 0) {
			int remainder = input % 10;
			reverse = reverse * 10 + remainder;
			input = input / 10;
		}
		System.out.println(reverse);

	}

}
