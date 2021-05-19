package leetcode.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid(")["));
    }

    public static boolean isValid(String s) {
        if(s.length() < 2) {
            return false;
        }
        Stack<Character> exp = new Stack<>();
        List<Character> close = Arrays.asList('}', ')', ']');
        for (char c : s.toCharArray()) {
            if (close.contains(c)) {
                if (!exp.isEmpty() && ((c == ']' && exp.peek() == '[') || (c == '}'
                        && exp.peek() == '{') || (c == ')'
                        && exp.peek() == '('))) {
                    exp.pop();
                } else {
                    return false;
                }
            } else {
                exp.add(c);
            }
        }

        return exp.isEmpty();
    }
}
