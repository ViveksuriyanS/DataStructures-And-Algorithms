package datastructures.string;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		String inputString = "abacadf";
		String checkString = "";
		Map<String, Integer> pal = new HashMap<String, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			checkString += inputString.charAt(i);
			if (Palindrome.checkPalindrome(checkString)) {
				pal.put(checkString, checkString.length());
			}
		}

		System.out.println(pal.entrySet());
		System.out.println(Collections.max(pal.entrySet(), Map.Entry.comparingByValue()));

	}

}
