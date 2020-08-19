package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterate {

	public static void main(String[] args) {
		// HashMap
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 20);
		map.put(2, 80);
		map.put(3, 100);

		// Using entrySet()
		System.out.println(map.entrySet());

		// Using Iterator
		Iterator<Entry<Integer, Integer>> mapIter = map.entrySet().iterator();
		while (mapIter.hasNext()) {
			Entry<Integer, Integer> entry = mapIter.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// Using forEach()
		map.forEach((key, value) -> System.out.println(key + " " + value));

		// for(Entry)
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
