class WordPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.trim();
        if (s == null)
            return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        if (s.isEmpty())
            return true;
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("tacocat"));
    }
}