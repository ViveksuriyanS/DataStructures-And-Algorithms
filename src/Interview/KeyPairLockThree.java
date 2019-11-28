package Interview;

import java.util.Arrays;

public class KeyPairLockThree {

	public static void main(String[] args) {
		int[] inputArr = { 3, 9, 12, 1, 2, 3, 6 };
		int sum = 22;
		findThreePair(inputArr, sum);

	}

	private static void findThreePair(int[] inputArr, int sum) {
		quickSort(inputArr, 0, inputArr.length - 1);
		System.out.println(Arrays.toString(inputArr));

		int j;
		int k;
		for (int i = 0; i < inputArr.length - 2; i++) {
			j = i + 1;
			k = inputArr.length - 1;
			while (j < k) {
				int summX = inputArr[i] + inputArr[j] + inputArr[k];
				if (summX == sum) {
					System.out.println(inputArr[i] + " " + inputArr[j] + " " + inputArr[k]);
					return;
				} else if (summX < sum) {
					j++;
				} else if (summX > sum) {
					k--;
				}
			}

		}

	}

	private static void quickSort(int[] inputArr, int i, int j) {
		if (i < j) {
			int partitionIndex = quickSortPartition(inputArr, i, j);
			quickSort(inputArr, i, partitionIndex - 1);
			quickSort(inputArr, partitionIndex + 1, j);
		}
	}

	private static int quickSortPartition(int[] inputArr, int startIndex, int endIndex) {
		int pivotIndex = 0;
		int pivotValue = inputArr[endIndex];
		int i;
		for (i = 0; i < endIndex; i++) {
			if (inputArr[i] < pivotValue) {
				int tmp = inputArr[i];
				inputArr[i] = inputArr[pivotIndex];
				inputArr[pivotIndex] = tmp;
				pivotIndex++;
			}
		}
		int replaceTmp = inputArr[inputArr.length - 1];
		inputArr[inputArr.length - 1] = inputArr[pivotIndex + 1];
		inputArr[pivotIndex + 1] = replaceTmp;
		return pivotIndex;

	}

}
