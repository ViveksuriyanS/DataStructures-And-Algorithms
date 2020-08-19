package com.arrays;

import java.util.Scanner;

public class isAnagram {
	static boolean isAnagram1(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}

		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();

		char[] combine = (a + b).toCharArray();
		
		while (notNullChar(c, d) != 0) {
			int xCount = 0;
			int yCount = 0;
			for (int i = 0; i < combine.length; i++) {
				for (int j = i + 1; i < c.length; j++) {
					if (c[i] != '0')
						if (c[i] == c[j]) {
							xCount++;
							c[j] = '0';
						}
				}
				for (int j = i + 1; i < combine.length; j++) {
					if (d[i] != '0')
						if (d[i] == d[j]) {
							yCount++;
							d[j] = '0';
						}
				}

				if (xCount == yCount) {
					return false;
				}
			}
		}
		return true;
	}

	private static int notNullChar(char[] c, char[] d) {
		int count = 0;
		for (char x : c) {
			if (x != '0') {
				count++;
			}
		}
		for (char x : d) {
			if (x != '0') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram1(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
