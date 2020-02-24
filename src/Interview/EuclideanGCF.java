package Interview;

public class EuclideanGCF {

	public static void main(String[] args) {
		int a = 15;
		int b = 5;
		gcf(a, b);
	}

	public static void gcf(int a, int b) {
		if (a != b) {
			int c = Math.abs(a - b);

			System.out.println("a=" + a + " b=" + b + " c=" + c);
			// Setting value of y to a and c to b for next recursive call
			a = b;
			b = c;

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
