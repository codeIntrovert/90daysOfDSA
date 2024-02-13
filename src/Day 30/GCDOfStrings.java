public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // If concatenating str1 and str2 doesn't equal str2 and str1, return an empty
                       // string.
        }

        int length1 = str1.length();
        int length2 = str2.length();


        int a = length1;
        int b = length2;

        // logic
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }



        return str1.substring(0, a); // Return the substring of str1 up to the length of gcdLength.
    }


    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2)); // Output: "ABC"

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2)); // Output: "AB"

        str1 = "LEET";
        str2 = "CODE";
        System.out.println(gcdOfStrings(str1, str2)); // Output: ""
    }
}
