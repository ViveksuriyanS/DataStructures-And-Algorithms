package Interview;

public class EuclideanGCF {

	public static void main(String[] args) {
		int a = 12;
		int b = 5;
		gcf(a, b);
	}

	public static void gcf(int a, int b) {
		int c = 0;
		if (a != b) {
			// Finding the maximum between a and b
			int x = Math.max(a, b);
			// Finding the minimum between a and b
			int y = Math.min(a, b);
			// Negating y from x and storing it in c
			c = x - y;

			// Setting value of y to a and c to b for next recrusive call
			a = y;
			b = c;
			System.out.println("a=" + x + " b=" + y + " c=" + c);
			gcf(a, b);
		} else {
			System.out.println(a + " is the GCD");
			System.exit(0);
		}

	}
}

// Steps
// 1. Subtract A from B and store it in C
// 2. Store A->B and B->C and call the recursion of GCD
// 3. Repeat the step 1 and 2, till A==B 
