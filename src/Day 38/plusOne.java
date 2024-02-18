import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // if all digits are 9 i.e [9,9,9,9,9,9]
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(nums1))); // Output: [1, 2, 4]

        // Example 2
        int[] nums2 = { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(plusOne(nums2))); // Output: [4, 3, 2, 2]

        // Example 3
        int[] nums3 = { 0 };
        System.out.println(Arrays.toString(plusOne(nums3))); // Output: [1]
    }
}
