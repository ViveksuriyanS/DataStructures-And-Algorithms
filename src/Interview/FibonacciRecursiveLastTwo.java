package Interview;

import java.util.Arrays;

public class FibonacciRecursiveLastTwo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(Arrays.toString(fibonacci(i)));
	}

	/** Returns array containing the pair of Fibonacci numbers, F(n) and F(n-1) */
	public static long[] fibonacci(int n) {
		if (n <= 1) {
			long[] answer = { n, 0 };
			return answer;
		} else {
			long[] temp = fibonacci(n - 1); // returns {F(n-1), F(n-2)
			long[] answer = { temp[0] + temp[1], temp[0] }; // we want {F(n), F(n-1)}
			return answer;
		}
	}
}
