package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsValidNumber {
    public static void main(String[] args) {
        boolean output = isNumber("e");
        System.out.println(output);
    }
    public static boolean isNumber(String s) {
        Pattern pattern = Pattern.compile(s);
        Matcher matches = pattern.matcher("[+-]?[.]?[0-9]?{[e]?[E]?[+-]}?[0-9]?");

        return matches.find();
    }
    public static boolean isNumber1(String s) {
        boolean valid = false;
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf(s.charAt(i));
            if (48 <= (int) s.charAt(i) && (int) s.charAt(i) <= 57) {
                valid = true;
            } else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i == 0) {
                    valid = true;
                } else if(s.charAt(i-1) == 'e' || s.charAt(i-1) == 'E') {
                    valid = true;
                } else {
                    return false;
                }
            } else if( s.charAt(i) == '.' ) {
                if(s.length() == 1 || (index != s.lastIndexOf(s.charAt(i)))) {
                    return false;
                }
                valid = true;
            } else if( s.charAt(i) == 'e' || s.charAt(i) == 'E') {

                if(index == 0  || s.length() == 1 || index == s.length() -1) {
                    return false;
                }
                valid = true;
            }
            else {
                return false;
            }
        }
        return valid;
    }
}

