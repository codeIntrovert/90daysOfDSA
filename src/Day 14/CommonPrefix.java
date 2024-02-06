import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = { "flower", "flow", "flight" }; // Create an array of strings
        System.out.println(solution.longestCommonPrefix(input)); // Call the method on the instance
    }
}
