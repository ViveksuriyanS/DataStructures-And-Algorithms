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
		// @ReturnType Collection<String> -> Returns all the values
		System.out.println(collect.values());
		// @ReturnType Set<Integer> -> Returns all the Keys
		System.out.println(collect.keySet());
		// @ReturnType Set<Entry<Integer,String>> -> Returns all the <Key,Value> pair
		System.out.println(collect.entrySet());
		// @ReturnType String --> Returns value or defined String
		System.out.println(collect.getOrDefault(6, "Six")); // Returns Six (Not Found)
		System.out.println(collect.getOrDefault(5, "New Five")); // Returns Five (Found)

		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.putAll(collect);

		// @ReturnType String -> Null if new Insert, Existing Value if already present
		System.out.println(newMap.putIfAbsent(6, "Six")); // Null -> put(6,"Six")
		System.out.println(newMap.putIfAbsent(5, "New Five")); // Five -> get(5)

		// @ReturnType Boolean -> true if found, false if not found
		System.out.println(newMap.containsKey(5)); // true
		System.out.println(newMap.containsKey(7)); // false

		//
		System.out.println(newMap.containsValue("Five"));

		HashMap<Integer, NewObject> objMap = new HashMap<Integer, NewObject>();
		NewObject n1 = new NewObject(1, "Vivek");
		NewObject n2 = new NewObject(2, "Suriya");
		objMap.put(1, n1);
		objMap.put(2, n2);
		System.out.println(objMap.containsValue(n1));
		System.out.println(objMap.containsValue(n2));
	}

}

class NewObject {
	int id;
	String name;

	public NewObject(int id, String name) {
		this.id = id;
		this.name = name;
	}
}