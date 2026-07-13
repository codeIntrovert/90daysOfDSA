/**
 * implement toLowerCase();
 * https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String s) {
     //check asci sequence and replace it
     // A TO Z = 65 TO 90
     // a to Z = 97 to 122
     int len =  s.length();
     char[] charArray = s.toCharArray();
     char[] smallArray = new char[len];
    for(int i=0; i<len; i++){
        int ascii = charArray[i];
        if(ascii<91 && ascii>64){
            ascii = ascii+32;
            smallArray[i] = (char) ascii;
        }
        else{
            smallArray[i] = charArray[i];
        }

    }
    String afterSmall = new String(smallArray);
     return afterSmall;
     }

}