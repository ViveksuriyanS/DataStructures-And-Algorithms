package algorithms.expression.conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// Reverse of Postfix to Infix
public class PrefixToInfix {
    public static void main(String[] args) {
        List<Character> operator = Arrays.asList('+','-','/','*');
        String st = "*+AB-CD";
        StringBuilder sb = new StringBuilder(st);
        st = sb.reverse().toString();
        Stack<String> res = new Stack<>();
        for(char c : st.toCharArray()) {
            if(operator.contains(c)) {
                String s1 = res.pop();
                String s2 = res.pop();
                String out = "(" + s1 + c + s2 + ")"; // Format S1 + C + S2
                res.add(out);
            } else {
                res.add(String.valueOf(c));
            }
        }
        System.out.println(res);
    }
}
