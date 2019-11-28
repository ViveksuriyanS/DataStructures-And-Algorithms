package datastructures.string;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String st = "String";
		System.out.println(reverseRecurse(st));

	}

	private static String reverseRecurse(String st) {
		if (st.isEmpty()) {
			return st;
		}
		System.out.println(st.substring(1) + st.charAt(0));
		return reverseRecurse(st.substring(1)) + st.charAt(0);

	}

}
