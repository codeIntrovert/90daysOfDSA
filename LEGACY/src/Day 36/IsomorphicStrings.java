// https://leetcode.com/problems/isomorphic-strings/

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap[sChar] != tMap[tChar]) {
                return false;
            }

            sMap[sChar] = i + 1;
            tMap[tChar] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(isIsomorphic("egg", "add")); // Output: true
        System.out.println(isIsomorphic("foo", "bar")); // Output: false
        System.out.println(isIsomorphic("paper", "title")); // Output: true
    }
}