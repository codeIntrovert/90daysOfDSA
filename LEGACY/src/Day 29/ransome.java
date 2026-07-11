class ransome {
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char currentChar = ransomNote.charAt(i);
            boolean found = false;
            for (int j = 0; j < magazine.length(); j++) {
                if (currentChar == magazine.charAt(j)) {
                    found = true;
                    magazine = magazine.substring(0, j) + magazine.substring(j + 1);
                    break;
                }
            }
            if (!found) {
                return false; // Character not found in magazine
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println(canConstruct(ransomNote1, magazine1)); // Output: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println(canConstruct(ransomNote2, magazine2)); // Output: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote3, magazine3));
    }
}