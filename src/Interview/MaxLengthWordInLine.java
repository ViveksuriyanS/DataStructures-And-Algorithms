package Interview;

import java.util.Arrays;

public class MaxLengthWordInLine {

	public static void main(String[] args) {
		String line = "Hey, Hello! There... What is your name?";
		System.out.println("The maximum Length with Special Character: " + maxLength(""));
		System.out.println("The maximum Length with Special Character: " + maxLength(line));
		// Remove special characters from string
		line = line.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("The maximum length without special characters " + maxLength(line));
		System.out.println(line);
	}

	public static int maxLength(String inputLine) {
		String words[] = inputLine.split(" ");
		System.out.println(Arrays.toString(words));
		String tmpString = null;
		int maxLength = 0;
		for (String st : words) {
			if (maxLength < st.length()) {
				maxLength = st.length();
				tmpString = st;
			}
		}
		System.out.println("Output: " + tmpString);

		return maxLength > 0 ? maxLength : 0;
	}

}
