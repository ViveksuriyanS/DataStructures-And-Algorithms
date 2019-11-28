package Interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InterviewRevision {

	public static void main(String[] args) {
		// Given a string to charArray
		String st = "String";
		char[] chArr = st.toCharArray();
		System.out.println(Arrays.toString(chArr));

		// Converting array to list
		// Conversion is not possible, as the array is of primitive types
//		List<Character> stArrList = Arrays.asList(chArr);

		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// Conversion is not possible, as the array is of primitive types
//		List<Integer> intList = Arrays.asList(intArr);

		String[] stringArr = { "S", "t", "r", "i", "n", "g" };
		List<String> stringList = Arrays.asList(stringArr);
	}

}
