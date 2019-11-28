package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSortByKey {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vivek", 100);
		map.put("Suriya", 200);
		map.put("Vishnu", 250);
		map.put("Raj", 150);
		map.put("Naga", 50);
		SoryByKeys(map);
	}

	private static void SoryByKeys(Map<String, Integer> map) {
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>();
		sortedMap.putAll(map);
		System.out.println(sortedMap);
	}

}
