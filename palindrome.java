class palindrome {
    public static void main(String[] args) {

        int x = 101;
        System.out.println(checkPalindrome(x));
    }

    public static boolean checkPalindrome(int input) {
        int number = input;
        int reversedNumber = 0;
        if (input < 0) {
            return false;
        }

        // reverse number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        return input == reversedNumber;
    }
}