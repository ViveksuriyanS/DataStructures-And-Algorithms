package datastructures.hashtable;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTableEg {

	String[] elements;
	int tableSize;

	public static void main(String[] args) {
//		String[] elementArray = { "3", "5", "9", "6", "2", "4", "7", "0", "8", "1" };
//		HashTableEg hashTable = new HashTableEg(15);
//		hashTable.hashFunction1(elementArray, hashTable.elements);
//		hashTable.printHashTable(hashTable.elements);
		
		// Trying collision with HashFunction
		String[] elementArray1 = { "13", "51", "19", "16", "22", "34", "75", "20", "28", "15", "17" };
		HashTableEg hashTable1 = new HashTableEg(15);
		hashTable1.hashFunction2(elementArray1, hashTable1.elements);
		hashTable1.printHashTable(hashTable1.elements);
		hashTable1.hashSearch("34");
		hashTable1.hashSearch("11");
		hashTable1.increaseArraySize(30);
		hashTable1.printHashTable(hashTable1.elements);
	}

	HashTableEg(int size) {
		tableSize = size;
		elements = new String[tableSize];
		Arrays.fill(elements, "-1");
	}

	// HashTable simply stores the element in the index of the same element in
	// array
	// Possibility of adding duplicate element is possible, then collision might
	// occur
	// To avoid we write efficient hashFunction which handles collision
	// Check for availability, if index not occupied add, else add to next index
	// The below function does not handle duplication
	public void hashFunction1(String[] sourceArray, String[] resultArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			String element = sourceArray[i];
			resultArray[Integer.parseInt(element)] = element;
		}
	}

	// Handle duplicate insertion with the help of hashFunction by inserting at
	// new index
	// Ensure the
	public void hashFunction2(String[] sourceArray, String[] resultArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			String element = sourceArray[i];
			// better to use a prime number(tableSize) while doing mod operation
			// prime value less than arraySize
			// Using prime number avoids collision
			// int arrayIndex = Integer.parseInt(val) % 17;
			int arrIndex = Integer.parseInt(element) % tableSize;
			System.out.println("Modular Index:" + arrIndex + "---Value:" + element);
			while (resultArray[arrIndex] != "-1") {
				++arrIndex;
				System.out.println("Collision occured, try index -" + arrIndex);
				arrIndex %= tableSize;
			}
			resultArray[arrIndex] = element;
		}
	}

	
	// To avoid clustering and efficient storage of date we use double hashing
	// Hashing(modulo of primeNumber to avoid collision) over Hashing (Prime number negating)
	public void doubleHashFunction(String[] sourceArray, String[] resultArray) {
		for (int i = 0; i < sourceArray.length; i++) {
			String element = sourceArray[i];
			// better to use a prime number(tableSize) while doing mod operation
			// prime value less than arraySize
			// Using prime number avoids collision
			// int arrayIndex = Integer.parseInt(val) % 17;
			int arrIndex = Integer.parseInt(element) % tableSize;
			int primeNum = 5; // 3,7,..
			int stepDistance = primeNum - (Integer.parseInt(element) % primeNum);
			System.out.println("Modular Index:" + arrIndex + "---Value:" + element);
			while (resultArray[arrIndex] != "-1") {
				//adding step distance
				arrIndex +=stepDistance;
				System.out.println("Collision occured, try index -" + arrIndex);
				arrIndex %= tableSize;
			}
			resultArray[arrIndex] = element;
		}
	}
	
	public String doubleHashSearch(String val) {
		// better to use a prime number(tableSize) while doing mod operation
		// prime value less than arraySize
		// Using prime number avoids collision
		// int arrayIndex = Integer.parseInt(val) % 17;
		int arrayIndex = Integer.parseInt(val) % tableSize;
		int primeNum = 5; // 3,7,..
		int stepDistance = primeNum - (Integer.parseInt(val) % primeNum);
		while (elements[arrayIndex] != "-1") {
			System.out.println(arrayIndex);
			if (elements[arrayIndex] == val) {
				System.out.println("Element " + elements[arrayIndex] + " found at index : " + arrayIndex);
				return elements[arrayIndex];
			}
			arrayIndex +=stepDistance;
			arrayIndex %= tableSize;
		}
		
		System.out.println("Element not found");
		return null;
	}
	
	public boolean isPrime(int key) {
		if (key % 2 == 0)
			return false;
		for (int i = 3; i * i <= key; i += 2) {
			if (key % i == 0) {
				return false;
			}
		}

		return true;
	}

	public int getNextPrimeNum(int nextNum) {
		for (int i = nextNum; true; i++) {
			if (isPrime(i)) {
				return i;
			}
		}
	}
	
	// -- Increasing Hash Size
	// 1- Find the prime number bigger than the size of the new array
	// Fill the elements in temporary array by eliminating empty values from elements Array
	// Increase the size of the element array with next biggest prime number found
	// Set array size as new prime number
	// Fill the newly created array with -1
	// Call hashFunction to store the values again with new indexes
	public void increaseArraySize(int minArraySize) {
		int newArraySize = getNextPrimeNum(minArraySize);
		moveOldArray(newArraySize);
	}
	
	public void moveOldArray(int newArraySize) {
		String[] cleanArray = removeEmptySpaceInArray(elements);
		elements = new String[newArraySize];
		tableSize = newArraySize;
		fillArrayWithNeg1();
		hashFunction2(cleanArray, elements);
	}

	public void fillArrayWithNeg1() {
		Arrays.fill(elements, "-1");
	}
	
	public String[] removeEmptySpaceInArray(String[] cleanArray) {
		ArrayList<String> cleanList = new ArrayList<String>();
		for(String ele : cleanArray) {
			if(ele != "-1" && ele != "") {
				cleanList.add(ele);
			}
		}
		
		return cleanList.toArray(new String[cleanList.size()]);
	}
	
	public String hashSearch(String val) {
		// better to use a prime number(tableSize) while doing mod operation
		// prime value less than arraySize
		// Using prime number avoids collision
		// int arrayIndex = Integer.parseInt(val) % 17;
		int arrayIndex = Integer.parseInt(val) % tableSize;
		while (elements[arrayIndex] != "-1") {
			System.out.println(arrayIndex);
			if (elements[arrayIndex] == val) {
				System.out.println("Element " + elements[arrayIndex] + " found at index : " + arrayIndex);
				return elements[arrayIndex];
			}
			++arrayIndex;
			arrayIndex %= tableSize;
		}
		
		System.out.println("Element not found");
		return null;
	}
	
	public void printHashTable(String[] hashTableArray) {
		for (int x = 0; x < hashTableArray.length; x++) {
			System.out.println("Index : " + x + " -- Element:" + hashTableArray[x]);
		}
	}
}

// HashTable is a data structure based on array
// Insertion order is not retained
// Provides fast addition and searching of element
// Key Value are assigned to the element in the HashTable using HashFunction
// Hash Function helps in calculating best index for the element
// Data will not be overwritten, if index occupied, go for next free index
// Can be resized, but needs to be avoided as the operation is costly
// While searching, instead of traversing through each element it calculates the
// --item index
