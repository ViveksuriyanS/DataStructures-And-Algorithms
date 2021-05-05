package Interview;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnagramCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	static boolean isAnagram(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}
		Map<Character, Integer> aMap = new TreeMap<Character, Integer>();
		Map<Character, Integer> bMap = new TreeMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			aMap.computeIfPresent(a.charAt(i), (key, val) -> val + 1);
			aMap.computeIfAbsent(a.charAt(i), (val) -> 1);
			bMap.computeIfPresent(b.charAt(i), (key, val) -> val + 1);
			bMap.computeIfAbsent(b.charAt(i), (val) -> 1);
		}
		if (aMap.size() != bMap.size())
			return false;

		Iterator<Map.Entry<Character, Integer>> aIter = aMap.entrySet().iterator();
		Iterator<Map.Entry<Character, Integer>> bIter = bMap.entrySet().iterator();

		while (aIter.hasNext() && bIter.hasNext()) {
			Map.Entry<Character, Integer> acurrent = aIter.next();
			Map.Entry<Character, Integer> bcurrent = bIter.next();

			if (acurrent.getKey() != bcurrent.getKey()) {
				return false;
			} else {
				if (acurrent.getValue() != bcurrent.getValue()) {
					return false;
				}
			}
		}

		return true;
	}

}

// This solution is not efficient
// Check in JavaPrograms-> String
