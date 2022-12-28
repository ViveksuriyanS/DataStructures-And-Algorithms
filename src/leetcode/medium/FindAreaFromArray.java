package leetcode.medium;

import java.util.Arrays;

public class FindAreaFromArray {

    public static void main(String[] args) {
        int[] input = {1, 2, 6, 5, 8, 2, 4, 9, 8, 6, 1};

        System.out.println(Arrays.toString(input));
        System.out.println(maxArea(input));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            maxArea = Math.max((Math.min(height[left], height[right]) * right - left), maxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
