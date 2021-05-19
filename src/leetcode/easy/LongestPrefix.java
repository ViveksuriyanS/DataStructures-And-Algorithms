package leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {
    public static void main(String[] args) {
        String strs[] = {"dog", "dracecar", "dcar"};
        longestCommonPrefix(strs);
    }

    public static String longestCommonPrefix(String[] strs) {
        String op = "";
        int minWordLen = Arrays.stream(strs).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }).findFirst().get().length();

        for (int i = 0; i < minWordLen; i++) {
            Character cx = null;
            boolean valid = true;
            for (int j = 0; j < strs.length; j++) {
                if (cx == null) {
                    cx = strs[j].charAt(i);
                } else if (cx == strs[j].charAt(i)) {
                    continue;
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                op += cx;
            } else {
                break;
            }
        }
        System.out.println(op);
        return op;
    }
}
