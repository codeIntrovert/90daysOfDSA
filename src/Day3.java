//https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        // string to array
        int k = 0;
        String p = s.trim();
        int n = p.length();
        //char[] c = new char[n];

        // loop from backward
        for(int i=n-1;i>=0;i--){
            if(p.charAt(i) == ' '){
                break;
            }
            else{
                k++;
            }
        }
        return k;
    }
}

/**
 * Best Solution (this makes me look dumb)
 * 
public int lengthOfLastWord(String s) {
    s = s.trim();
    return s.length() - s.lastIndexOf(' ') - 1;
}

 */