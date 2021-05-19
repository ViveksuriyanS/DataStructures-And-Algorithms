package Interview.DesignPatterns;

import java.util.Map;

public class SingletonClass {

	public static void main(String[] args) {
		Singleton singleObject = Singleton.getInstance();
		System.out.println(singleObject.random);
		singleObject.random = 20;
		Singleton singleObject1 = Singleton.getInstance();
		System.out.println(singleObject1.random); // Since both object refer to random
		// The value will be changed
		// If it is different objects, then it will be related within object
	}

}

class Singleton {
	private static Singleton singleton = null;
	int random;

	
	private Singleton() {
		random = 10;
	}

	// Singleton object cannot be created with new() keyword
	// LazyInitialization
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

	// Eager Initialization
	static {
		singleton = new Singleton();
	}

}