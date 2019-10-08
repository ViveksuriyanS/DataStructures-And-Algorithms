package Arrays;

// LONGEST SPAN WITH THE SAME SUM IN TWO BINARY ARRAY

// A1 = [1, 0, 0, 1, 0]
// A2 = [0, 1, 1, 1, 0]
// MAXLENGTH ==> 2 

public class LongestSpanSum {

	public static void main(String[] args) {
		int arr1[] = new int[] { 0, 1, 0, 1, 1, 1, 1 };
		int arr2[] = new int[] { 1, 1, 1, 1, 1, 0, 1 };
		System.out.println(maxSumLength(arr1, arr2));
	}

	public static int maxSumLength(int[] a1, int[] a2) {
		// Variable that stores the maximum sum length
		int maxLength = 0;

		for (int i = 0; i < a1.length; i++) {
			int s1 = 0;
			int s2 = 0;
			for (int j = i; j < a2.length; j++) {
				s1 = s1 + a1[j];
				s2 = s2 + a2[j];
				
				if(s1 == s2) {
					// Go through the youtube video https://www.youtube.com/watch?v=xtfj4-r_Ahs
					int temp = j - i + 1;
					if(maxLength < temp) {
						maxLength = temp;
					}
				}
			}
		}

		return maxLength;
	}

}

// https://www.geeksforgeeks.org/longest-span-sum-two-binary-arrays/