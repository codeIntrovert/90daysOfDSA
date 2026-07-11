public class addBinary {
    public String addBinaryfunc(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.insert(0, sum % 2); // Insert the least significant bit of the sum
            carry = sum / 2; // Update the carry for the next iteration
        }

        if (carry != 0) {
            result.insert(0, carry); // If there's a carry after the loop, insert it
        }

        return result.toString();
    }

    public static void main(String[] args) {
        addBinary solution = new addBinary();

        String a1 = "11";
        String b1 = "1";
        System.out.println("Output 1: " + solution.addBinaryfunc(a1, b1)); // Output: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println("Output 2: " + solution.addBinaryfunc(a2, b2)); // Output: "10101"
    }
}
