// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if (digits == null || digits.isEmpty())
            return results;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        char[] arr = new char[digits.length()];
        buildCombinations(digits, 0, map, arr, results);
        return results;

    }

    private void buildCombinations(String digits, int i, Map<Character, String> map, char[] arr, List<String> results) {
        if (i == digits.length()) {
            results.add(new String(arr));
            return;
        }
        Character c = digits.charAt(i);
        String s = map.get(c);
        for (int j = 0; j < s.length(); j++) {
            arr[i] = s.charAt(j);
            buildCombinations(digits, i + 1, map, arr, results);
        }
    }
}