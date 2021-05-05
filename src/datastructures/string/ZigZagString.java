package datastructures.string;

public class ZigZagString {

	public static void main(String[] args) {
		String input = "PAYPALISHIRING";
		int zigzagNum = 3;
		for (int i = 0; i < input.length(); i++) {
			if (i < zigzagNum) {
				System.out.println(input.charAt(i));
			}

		}
	}

}
