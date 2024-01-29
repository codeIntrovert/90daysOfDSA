public class needleHaystack {
    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);
        if (index != -1) { // if word is found
            return index;
        } else {
            return -1; // else
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack2, needle2)); // Output: -1
    }
}
