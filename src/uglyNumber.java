public class uglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(77));
    }

    static boolean isUgly(int n) {

        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                continue;
            }
            if (n % 3 == 0) {
                n = n / 3;
                continue;
            }
            if (n % 5 == 0) {
                n = n / 5;
                continue;
            }
            return false;
        }
        return true;

    }
}