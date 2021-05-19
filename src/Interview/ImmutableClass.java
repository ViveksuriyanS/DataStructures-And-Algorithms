package Interview;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {

	private final int dataX;
	private final Map<String, Integer> map;

	public ImmutableClass(int data, Map<String,Integer> map) {
		this.dataX = data;
		Map<String,Integer> tmp= new HashMap<>();
		//map.putAll(map);
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			tmp.put(entry.getKey(), entry.getValue());
		}
		this.map = tmp;
	}

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("Dhoni", 7);
		mp.put("Sachin", 10);
		mp.put("Sehwag", 44);
		ImmutableClass c1 = new ImmutableClass(5000, mp);
		ImmutableClass c2 = new ImmutableClass(2000, mp);
		//c1.dataX = 3000;
		System.out.println(c1.getDataX() + " " + c1);
		System.out.println(c1.getMap().entrySet());
		System.out.println(c2.getDataX() + " " + c2);
		mp = c2.getMap(); // return new reference
		mp.put("Ashwin", 44);
		System.out.println(c2.getMap().entrySet());

	}

	public int getDataX() {
		return dataX;
	}

	public Map<String, Integer> getMap() {
		Map<String,Integer> tmp= new HashMap<>();
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			tmp.put(entry.getKey(), entry.getValue());
		}
		return tmp;
	}
}
