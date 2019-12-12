package Interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacciX(i));
			System.out.println(fibonacciY(i));
		}
	}

	private static int fibonacciX(int size) {
		int fib1 = 1;
		int fib2 = fib1;
		if (size == 1 || size == 2) {
			return fib1;
		}
		int newFib = 0;
		for (int i = 2; i < size; i++) {
			newFib = fib1 + fib2;
			fib1 = fib2;
			fib2 = newFib;
		}
		return newFib;
	}

	private static int fibonacciY(int size) {

		if (size == 0) {
			return 0;
		}
		if (size == 1 || size == 2) {
			return 1;
		}

		return fibonacciY(size - 1) + fibonacciY(size - 2);

	}
}
