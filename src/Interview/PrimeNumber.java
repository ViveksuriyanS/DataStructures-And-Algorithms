package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			findPrime(i);
		}

	}

	private static void findPrime(int k) {
		int count = 0;
		for (int i = 1; i <= k; i++) {
			if (k % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(k + " is a prime number");
		}

	}

}
