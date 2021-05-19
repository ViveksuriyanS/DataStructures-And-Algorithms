package leetcode.easy;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        int i = 0;
        if (x > 0) {
            int tmp = x;
            while (tmp != 0) {
                i = i*10 + tmp % 10;
                tmp = tmp / 10;
            }
        }
        System.out.println(i);
        return i == x ? true : false;
    }
}
