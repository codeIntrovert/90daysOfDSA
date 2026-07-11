// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int x1 = 123;
        int x2 = -123;
        int x3 = 120;

        System.out.println("Input: " + x1 + ", Output: " + reverse(x1));
        System.out.println("Input: " + x2 + ", Output: " + reverse(x2));
        System.out.println("Input: " + x3 + ", Output: " + reverse(x3));
    }
}
