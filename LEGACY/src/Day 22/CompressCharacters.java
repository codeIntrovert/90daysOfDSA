//https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75
public class CompressCharacters {
    public int compress(char[] chars) {
        int index = 0; // Index to update chars array
        int i = 0; // Index to traverse chars array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0; // Count of consecutive repeating characters

            // Count consecutive repeating characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Update chars array with compressed characters
            chars[index++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the new length of the array
    }

    public static void main(String[] args) {
        CompressCharacters cc = new CompressCharacters();

        // Test cases
        char[] chars1 = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int len1 = cc.compress(chars1);
        System.out.print(
                "Output: Return " + len1 + ", and the first " + len1 + " characters of the input array should be: [");
        for (int i = 0; i < len1; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print("'" + chars1[i] + "'");
        }
        System.out.println("]"); // Expected: Return 6, and the first 6 characters of the input array should be:
                                 // ['a', '2', 'b', '2', 'c', '3']

        char[] chars2 = { 'a' };
        int len2 = cc.compress(chars2);
        System.out.print(
                "Output: Return " + len2 + ", and the first " + len2 + " character of the input array should be: [");
        for (int i = 0; i < len2; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print("'" + chars2[i] + "'");
        }
        System.out.println("]"); // Expected: Return 1, and the first character of the input array should be:
                                 // ['a']

        char[] chars3 = { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };
        int len3 = cc.compress(chars3);
        System.out.print(
                "Output: Return " + len3 + ", and the first " + len3 + " characters of the input array should be: [");
        for (int i = 0; i < len3; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.print("'" + chars3[i] + "'");
        }
        System.out.println("]"); // Expected: Return 4, and the first 4 characters of the input array should be:
                                 // ['a', 'b', '1', '2']
    }
}
