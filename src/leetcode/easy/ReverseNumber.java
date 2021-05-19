package leetcode.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println( reverse(x));
    }
    public static int reverse(int x) {
        if(x == 0) {
            return 0;
        }
        String out = "";
        if(x < 0L ) {
            out+="-";
            x = Math.abs(x);
        }

        while(x != 0) {
            out += x%10;
            x=x/10;
        }
        int output = 0;
        try {
            output = Integer.parseInt(out);
        } catch (NumberFormatException e) {

        }


        return output;
    }
}
