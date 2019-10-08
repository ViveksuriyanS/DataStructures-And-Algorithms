package Collections;

import java.util.Stack;

public class Stacky {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Hi");
		stack.push("Hi1");
		stack.push("Hi2");
		stack.add("U1");
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.elementAt(2));
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		System.out.println(stack.set(1, "U2"));
		System.out.println(stack.remove(stack.size() -1));
		System.out.println(stack.isEmpty());
		System.out.println(stack.capacity());
		System.out.println(stack.elements().toString());

	}

}
