package datastructures.string;

import java.util.Stack;

public class StackReverse {
	public static void main(String[] args) {
		String s = "Reverse";
		notPop(s);
		withPop(s);

	}

	public static void notPop(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = s.length() - 1; i >= 0; i--) {
			stack.push(s.charAt(i));
		}
		System.out.println(stack.toString());
	}

	public static void withPop(String st) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < st.length(); ++i) {
			stack.push(st.charAt(i));
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
