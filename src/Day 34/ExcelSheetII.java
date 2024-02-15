// https://leetcode.com/problems/excel-sheet-column-number/

public class ExcelSheetII {

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int digit = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(titleToNumber("A")); // Output: 1
        System.out.println(titleToNumber("AB")); // Output: 28
        System.out.println(titleToNumber("ZY")); // Output: 701
    }
}