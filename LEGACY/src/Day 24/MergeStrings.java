public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        // Merge strings by adding letters in alternating order
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                merged.append(word2.charAt(j));
                j++;
            }
        }

        return merged.toString();
    }

    public static void main(String[] args) {
        MergeStrings ms = new MergeStrings();

        // Test cases
        String word1 = "abc", word2 = "pqr";
        System.out.println("Output: " + ms.mergeAlternately(word1, word2)); // Expected: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println("Output: " + ms.mergeAlternately(word1, word2)); // Expected: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println("Output: " + ms.mergeAlternately(word1, word2)); // Expected: "apbqcd"
    }
}
