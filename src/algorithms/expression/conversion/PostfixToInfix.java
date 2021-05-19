package algorithms.expression.conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        List<Character> operators = Arrays.asList('+', '-', '/', '*');
        // String st = "ABC-*D/";
        String st = "ABC-DE+/*";
        //String st = "AB+";
        Stack<String> infixStack = new Stack<>();
        for (char c : st.toCharArray()) {
            if (operators.contains(c)) {
                String st1 = infixStack.pop(); // B
                String st2 = infixStack.pop(); // A
                String result = "(" + st2 + c + st1 + ")"; // S2 + C + S2
                infixStack.add(result);
            } else {
                infixStack.add(String.valueOf(c));
            }
        }
        System.out.println(infixStack);
    }
}
