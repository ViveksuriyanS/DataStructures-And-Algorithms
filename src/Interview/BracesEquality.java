package Interview;

import java.util.Stack;

public class BracesEquality {

	public static void main(String[] args) {
		String s = "{{[()()()]}}";
		System.out.println(checkBalance(s));

	}

	public static boolean checkBalance(String in) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) == '{' || in.charAt(i) == '(' || in.charAt(i) == '[') {
				st.add(in.charAt(i));
			} else {
				if (st.isEmpty()) {
					return false;
				}
				if ((in.charAt(i) == ')' && st.peek() != '(') || (in.charAt(i) != '}' && st.peek() == '{')
						|| (in.charAt(i) == ']' && st.peek() != '[')) {
					return false;
				}
				st.pop();
			}
		}
		return st.isEmpty();
	}
}
