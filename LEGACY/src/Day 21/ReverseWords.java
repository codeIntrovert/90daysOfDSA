//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class ReverseWords {
    public String reverseWords(String s) {
        // Split the input string by spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Append words to StringBuilder in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();

        // Test cases
        String s1 = "the sky is blue";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + rw.reverseWords(s1)); // Expected: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + rw.reverseWords(s2)); // Expected: "world hello"

        String s3 = "a good   example";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + rw.reverseWords(s3)); // Expected: "example good a"
    }
}
