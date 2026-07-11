// https://leetcode.com/problems/word-pattern/description/
// hashmap problem

import java.util.HashMap;

public class wordPattern {

    public static boolean wordPatternCheck(String pattern, String s) {
        String[] word = s.split(" ");
        if (word.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(word[i])) {
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1:
        System.out.println(wordPatternCheck("abba", "dog cat cat dog")); // Output: true

        // Example 2:
        System.out.println(wordPatternCheck("abba", "dog cat cat fish")); // Output: false

        // Example 3:
        System.out.println(wordPatternCheck("aaaa", "dog cat cat dog")); // Output: false
    }
}
