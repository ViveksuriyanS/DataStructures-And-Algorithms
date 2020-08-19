package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapLinked_LRU {
	public static LinkedHashMap<String, Integer> lhm;

	public static void main(String[] args) {
		int maxCapacity = 5;
		lhm = new LinkedHashMap<String, Integer>(maxCapacity, 0.75f, true) {
			protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
				return size() > maxCapacity;
			}
		};
		putPrint("A", 1);
		putPrint("B", 2);
		putPrint("C", 3);
		putPrint("D", 4);
		putPrint("A", 1);
		putPrint("E", 5);
		putPrint("F", 6);
	}

	public static void putPrint(String key, Integer val) {
		lhm.put(key, val);
		System.out.println(lhm);
	}
}