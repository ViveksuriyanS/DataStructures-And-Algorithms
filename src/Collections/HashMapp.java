package Collections;

import java.util.HashMap;

public class HashMapp {

	public static void main(String[] args) {
		HashMap<Integer, String> collect = new HashMap<Integer, String>();
		collect.put(1, "One");
		collect.put(2, "Two");
		collect.put(3, "Three");
		collect.put(4, "Four");
		collect.put(5, "Five");
		System.out.println(collect.values());
		System.out.println(collect.keySet());
		System.out.println(collect.entrySet());
		System.out.println(collect);

	}
	
}
