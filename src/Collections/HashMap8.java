package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap8 {

	public static void main(String[] args) {
		String input = "Hello World !";
		Map<Character, Integer> wordFreq = new HashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			wordFreq.computeIfPresent(c, (key, val) -> val + 1);
			wordFreq.computeIfAbsent(c, (val) -> 1);
		}
		System.out.println(wordFreq);
	}

}
