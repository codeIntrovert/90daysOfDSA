/**
 * TODAY WE LEARN THE BASICS HOW INPUTS WORKS IN DSA ETC ETC 
 * https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        int count = digits.length;

        for (int i = count - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[count + 1];
        newArray[0] = 1; // Set first digit to 1
        
        return newArray; 
    }
}