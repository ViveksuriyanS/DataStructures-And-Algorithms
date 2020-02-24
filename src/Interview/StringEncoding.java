package Interview;

import java.util.Scanner;

public class StringEncoding {

	// For string ab, encode as !@@
	// cdf -> !!!@@@@!!!!!
	public static void main(String[] args) {
		char oddPos = '!';
		char evenPos = '@';

		Scanner scn = new Scanner(System.in);
		String st = scn.next();
		int ascii, repeat;
		for (int i = 0; i < st.length(); i++) {
			ascii = st.charAt(i);
			repeat = ascii >= 97 ? ascii - 96 : ascii - 64;
			for (int j = 0; j < repeat; j++) {
				if (i % 2 == 0) {
					System.out.print(evenPos);
				} else {
					System.out.print(oddPos);
				}
			}
		}

	}

}
