package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

class LRULHCache<K, V> {
	private LinkedHashMap<K, V> map;

	public LRULHCache(int capacity) {

		map = new LinkedHashMap<K, V>(capacity, 0.75f, true) {


			protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
				return size() > capacity;
			}
		};
	}

	// This method works in O(1)
	public V get(K key) {
		return map.get(key);
	}

	// This method works in O(1)
	public void set(K key, V value) {
		map.put(key, value);
	}

	@Override
	public String toString() {
		return "LinkedHashMap: " + map.toString();
	}
}

public class HashMapLinked_LRU2 {

	public static void main(String[] args) {
		LRULHCache<Integer, Integer> lruLHCache = new LRULHCache<>(2);
		lruLHCache.set(2, 12000);
		lruLHCache.set(40, 70000);

		System.out.println(lruLHCache);

		// renews the entry
		System.out.println(lruLHCache.get(2));

		System.out.println(lruLHCache);

		lruLHCache.set(20, 70000);

		System.out.println(lruLHCache);

		System.out.println(lruLHCache.get(2));

		System.out.println(lruLHCache);

		System.out.println(lruLHCache.get(40));

	}
}