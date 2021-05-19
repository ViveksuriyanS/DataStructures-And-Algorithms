package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingSequenceNumber {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static public int[] findErrorNums(int[] nums) {

        Set<Integer> vals = new HashSet<>();

        int sumOneToN = (nums.length * (nums.length + 1)) / 2;
        int duplicate = 0;
        int arrSum = 0;
        for (int i : nums) {
            if (!vals.add(i)) {
                duplicate = i;
            }
            arrSum += i;
        }

        return new int[]{duplicate, (sumOneToN - (arrSum - duplicate))};
    }
}
