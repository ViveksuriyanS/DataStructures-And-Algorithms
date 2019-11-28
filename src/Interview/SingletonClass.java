package Interview;

public class SingletonClass {

	public static void main(String[] args) {
		Singleton singleObject = Singleton.getInstance();
		System.out.println(singleObject.random);

		Singleton singleObject1 = Singleton.getInstance();
		System.out.println(singleObject1.random);
	}

}

class Singleton {
	private static Singleton singleton = null;
	int random;

	
	private Singleton() {
		random = 10;
	}

	// Singleton object cannot be created with new() keyword
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

}