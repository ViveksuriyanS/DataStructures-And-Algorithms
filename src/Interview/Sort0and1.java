package Interview;

import java.util.Arrays;

public class Sort0and1 {

	public static void main(String[] args) {
		int[] inputArr = { 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1 };

		int onesCount = 0;
		// First find the number of 1's are 0's
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == 1) {
				onesCount++;
			}
		}

		for (int j = 0; j < inputArr.length; j++) {
			System.out.println(onesCount);
			if (onesCount > 0) {
				inputArr[j] = 1;
				onesCount--;
			} else {
				inputArr[j] = 0;
			}

		}

		System.out.println(Arrays.toString(inputArr));
	}

}
