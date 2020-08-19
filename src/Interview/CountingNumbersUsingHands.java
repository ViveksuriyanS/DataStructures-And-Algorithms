package Interview;

import java.util.Scanner;

public class CountingNumbersUsingHands {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int modOutput = input % 8;
		if (modOutput == 1) {
			System.out.println(1 + " Thumb finger");
		}
		if (modOutput == 5) {
			System.out.println(5 + " Pinky finger");
		}
		if (modOutput == 0 || modOutput == 2) {
			System.out.println(2 + " Index finger");
		}
		if (modOutput == 3 || modOutput == 7) {
			System.out.println(3 + " Middle finger");
		}
		if (modOutput == 4 || modOutput == 6) {
			System.out.println(4 + " Ring finger");
		}
		scan.close();

	}

}

// 1-> Thumb 
//			2-> Index 3-> Middle 4-> Ring 
// 										5-> pinky  
//			8<- Index 7<- Middle 6<- Ring
// 9<- Thumb
//			11-> Index .... 								