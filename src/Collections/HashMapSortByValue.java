package Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vivek", 100);
		map.put("Suriya", 200);
		map.put("Vishnu", 250);
		map.put("Raj", 150);
		map.put("Naga", 50);
		SoryByValues(map);
	}

	private static void SoryByValues(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			temp.put(entry.getKey(), entry.getValue());
		}
		System.out.println(temp);
	}

}
