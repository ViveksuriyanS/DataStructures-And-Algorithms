package Interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestStringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String input = scan.next();
		Map<String, Integer> subStringLength = new HashMap<String, Integer>();
		String charSeq = "";
		for (int i = 0; i < input.length(); i++) {
			if (charSeq.contains(String.valueOf(input.charAt(i)))) {
				subStringLength.put(charSeq, charSeq.length());
				charSeq = "";
				i--;
			} else {
				charSeq = charSeq + input.charAt(i);
			}
		}
		// Adding the last sequence after exiting for loop
		subStringLength.put(charSeq, charSeq.length());
		System.out.println(subStringLength.entrySet());

		// String with maximum length
		System.out.println(Collections.max(subStringLength.entrySet(), Map.Entry.comparingByValue()).getKey());

		scan.close();

	}

}
