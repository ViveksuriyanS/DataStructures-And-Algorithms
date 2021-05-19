package algorithms.expression.conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        List<Character> operators = Arrays.asList('*','-','+','/','(',')');
        //String inp = "((A+B)*(C-D))";
        String inp = "A*(B-C)/D+E";
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(char c : inp.toCharArray()) {
            if(operators.contains(c)) {
                if(c != ')') {
                    op.add(c);
                } else {
                    while(op.peek() != '(') {
                        char operator = op.pop();
                        String op1 = st.pop();
                        String op2 = st.pop();
                        String res = op2 + op1 + operator;
                        st.add(res);
                    }
                    op.pop(); // removes ')'
                }
            } else {
                st.add(String.valueOf(c));
            }
        }
        while(op.size() > 0 && st.size() > 0) {
            char operator = op.pop();
            String op1 = st.pop();
            String op2 = st.pop();
            String res = op2 + op1 + operator;
            st.add(res);
        }
        System.out.println(st);
    }
}

// Input -> (A + B)
// Output -> AB+