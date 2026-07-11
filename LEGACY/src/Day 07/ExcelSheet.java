// https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheet {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            // Adjusting columnNumber to 0-based index
            columnNumber--;

            char digit = (char) ('A' + columnNumber % 26);
            result.insert(0, digit);

            // Move to the next digit
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(convertToTitle(1)); // Output: "A"
        System.out.println(convertToTitle(28)); // Output: "AB"
        System.out.println(convertToTitle(701)); // Output: "ZY"
    }
}
/*
 * This convertToTitle function takes an integer columnNumber as input and
 * returns its corresponding Excel column title as a string. The function uses a
 * StringBuilder to build the result in reverse order while continuously
 * dividing the columnNumber by 26 until it becomes 0. The conversion is
 * adjusted to a 0-based index, and the result is then reversed before
 * returning.
 * 
 * Certainly! Let me explain the logic of the `convertToTitle` function in detail:

1. The function starts by creating a `StringBuilder` named `result` to store the Excel column title.

2. In a while loop, the function iterates as long as `columnNumber` is greater than 0.

3. Inside the loop, the variable `digit` is calculated. It represents the rightmost character of the current column title. The calculation involves adding the ASCII value of 'A' to the remainder when `columnNumber` is divided by 26.

4. The calculated `digit` is then inserted at the beginning of the `result` using `result.insert(0, digit)` to build the column title in reverse order.

5. Next, `columnNumber` is adjusted to a 0-based index by subtracting 1. This is because in Excel, the column indexing starts from 1, but in this calculation, we want it to start from 0.

6. After that, `columnNumber` is divided by 26 to move on to the next digit in the column title.

7. The loop continues until `columnNumber` becomes 0.

8. Finally, the `result` is converted to a string, and the function returns the Excel column title.

In the example of `convertToTitle(28)`, the loop runs as follows:
- First iteration: `columnNumber = 28`, `digit = 'B'`, `result = "B"`
- Second iteration: `columnNumber = 1`, `digit = 'A'`, `result = "AB"`

So, the function returns "AB" as the Excel column title for the input 28. The same logic applies to other examples provided.
 */