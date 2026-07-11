// https://leetcode.com/problems/integer-to-roman/description/

public class integerToRoman {
    public static String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        int num1 = 3;
        int num2 = 58;
        int num3 = 1994;

        System.out.println("Example 1: " + intToRoman(num1));
        System.out.println("Example 2: " + intToRoman(num2));
        System.out.println("Example 3: " + intToRoman(num3));
    }
}
