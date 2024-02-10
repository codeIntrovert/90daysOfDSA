// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        boolean[] isVowel = new boolean[256]; // Assuming ASCII characters
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;
        isVowel['A'] = isVowel['E'] = isVowel['I'] = isVowel['O'] = isVowel['U'] = true;
        /*
         * ye boolean 256 bata raha hai ki ek array banao jisme saare characters ho
         * ascii ke, i.e A-Z, a-z aur @#$%^&*() etc
         * 
         * usme se a,e, i, o, u aur AEIOU ko true karo baaki ko false
         * hum log isko normal array {a,e,i,o,u} bana ke bhi check kar sakte hain but
         * that would be slow
         */
        while (i < j) {
            while (i < j && !isVowel[chars[i]]) {
                i++;
            }
            while (i < j && !isVowel[chars[j]]) {
                j--;
            }
            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseVowels rv = new ReverseVowels();

        // Test cases
        String s1 = "hello";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + rv.reverseVowels(s1)); // Expected: "holle"

        String s2 = "leetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + rv.reverseVowels(s2)); // Expected: "leotcede"
    }
}
