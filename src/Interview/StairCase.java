package Interview;

public class StairCase {

	public static void main(String[] args) {
		int blocks = 15;

		System.out.println(findSteps1(blocks));
		System.out.println(findSteps2(blocks));
	}

	// 1 Block -> 1st Step
	// 2 Blocks -> 2nd Step
	// 3 Blocks --> 3rd Step
	// .. If you are in 3rd step you need more than 1+2+3 => 6 blocks
	// 10,11,12,13,14 blocks -> 4 Step
	// 15 blocks -> 5step
	public static int findSteps1(int blocks) {
		int steps = 0;

		for (int i = 1; i <= blocks; i++) {
			blocks = blocks - i;
			steps++;
		}

		return steps;
	}

	    // 2 Block -> 1st Step
		// 3 Blocks -> 2nd Step
		// 4 Blocks --> 3rd Step
		// .. If you are in 3rd step you need more than 2+3+4 => 9 blocks
		// 10,11,12,13,14 blocks -> 4 Step
		// 15 blocks -> 5step
		public static int findSteps2(int blocks) {
			int steps = 0;

			for (int i = 2; i <= blocks; i++) {
				blocks = blocks - i;
				steps++;
			}

			return steps;
		}

}

