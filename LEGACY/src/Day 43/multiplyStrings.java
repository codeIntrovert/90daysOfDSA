public class multiplyStrings {
    public static String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = product + result[p2];
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : result) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String num1 = "2";
        String num2 = "3";
        System.out.println(multiply(num1, num2)); // Output: 6

        // Example 2
        String num3 = "123";
        String num4 = "456";
        System.out.println(multiply(num3, num4)); // Output: 56088
    }
}
