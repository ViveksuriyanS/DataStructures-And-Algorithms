package leetcode.easy;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("AA"));
    }

    public static int romanToInt(String s) {
        int x = 0;
        Map<Character, Integer> romanMap = new LinkedHashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        Queue<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            queue.add(c);
        }
        if (s.length() > 0) {
            while (!queue.isEmpty()) {
                char currVal = queue.remove();
                char nextVal = '1';
                if (queue.peek() != null) {
                    nextVal = queue.peek();
                }
                if ((currVal == 'I' && (nextVal == 'V' || nextVal == 'X'))
                        || (currVal == 'X' && (nextVal == 'L' || nextVal == 'C'))
                        || (currVal == 'C' && (nextVal == 'D' || nextVal == 'M'))) {
                    x += romanMap.get(queue.remove());
                    x -= romanMap.get(currVal);
                } else {
                    x += romanMap.get(currVal);
                }
            }
        }

        return x;
    }
}
