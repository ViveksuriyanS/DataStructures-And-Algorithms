package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameCalculator {
	public static Map<Character, Integer> alpha;

	public static void main(String[] args) {
		alpha = new HashMap<Character, Integer>();
		alpha.put('a', 1);
		alpha.put('b', 2);
		alpha.put('c', 3);
		alpha.put('d', 4);
		alpha.put('e', 5);
		alpha.put('f', 8);
		alpha.put('g', 3);
		alpha.put('h', 5);
		alpha.put('i', 1);
		alpha.put('j', 1);
		alpha.put('k', 2);
		alpha.put('l', 3);
		alpha.put('m', 4);
		alpha.put('n', 5);
		alpha.put('o', 7);
		alpha.put('p', 8);
		alpha.put('q', 1);
		alpha.put('r', 2);
		alpha.put('s', 3);
		alpha.put('t', 4);
		alpha.put('u', 6);
		alpha.put('v', 6);
		alpha.put('w', 6);
		alpha.put('x', 5);
		alpha.put('y', 1);
		alpha.put('z', 7);

//		System.out.println(sumEach("10158"));

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scan.nextLine();
		nameToNum(name.replaceAll(" ", ""));
		scan.close();
	}

	public static void nameToNum(String name) {
		int sum = 0;
		System.out.println(name);
		for (int i = 0; i < name.length(); i++) {
			sum += alpha.get(name.charAt(i));
		}
		System.out.println("Total num : " + sum);
		numSum(sum);
	}

	public static void numSum(int val) {
		String st = Integer.toString(val);
		if (st.length() == 1) {
			System.out.println(st);
			return;
		}
		int rx = sumEach(st);
		numSum(rx);
	}

	public static int sumEach(String st) {
		int x = Integer.parseInt(st);
		int sum = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
		}
		return sum;
	}
}
