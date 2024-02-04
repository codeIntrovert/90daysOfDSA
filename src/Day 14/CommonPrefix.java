public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // Return an empty string if the array is empty
        }

        int minLength = Integer.MAX_VALUE;

        // Find the minimum length among all strings
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        // Compare characters at the same position in all strings
        for (int i = 0; i < minLength; i++) {
            char currentChar = strs[0].charAt(i);

            // Check if the character is the same in all strings
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i); // Return the common prefix found so far
                }
            }
        }

        return strs[0].substring(0, minLength); // Return the common prefix found
    }

    public static void main(String[] args) {
        // Test cases
        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println("Output 1: " + longestCommonPrefix(strs1));

        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println("Output 2: " + longestCommonPrefix(strs2));
    }
}
