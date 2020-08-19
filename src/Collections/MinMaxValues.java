package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinMaxValues {
	public static void main(String[] args) {
		// Arrays
		Integer[] arrays = { 3, 4, 7, 2, 1, 9, 8, 5, 6 };
		int arrayMin = Collections.min(Arrays.asList(arrays));
		int arrayMax = Collections.max(Arrays.asList(arrays));
		System.out.println("Array min value:" + arrayMin);
		System.out.println("Array max value:" + arrayMax);

		// List
		List<Integer> list = Arrays.asList(arrays);
		int listMin = Collections.min(list);
		int listMax = Collections.max(list);
		System.out.println("List min value:" + listMin);
		System.out.println("List max value:" + listMax);

		// Set
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		int setMin = Collections.min(set);
		int setMax = Collections.max(set);
		System.out.println("Set min value:" + setMin);
		System.out.println("Set max value:" + setMax);

		// HashMap
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(5, 20);
		map.put(2, 80);
		map.put(3, 100);

		// Get min and max value of key
		int keyMin = Collections.min(map.keySet());
		int keyMax = Collections.max(map.keySet());
		System.out.println("Map key min value:" + keyMin);
		System.out.println("Map key max value:" + keyMax);

		// Get min and max value of key
		int valMin = Collections.min(map.values());
		int valMax = Collections.max(map.values());
		System.out.println("Map value min value:" + valMin);
		System.out.println("Map value max value:" + valMax);
	}
}
