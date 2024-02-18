import java.util.Arrays;

public class maximumProduct {
    public static int maxProd(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]); // both negative and
                                                                                                   // positive numbers
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 2, 3 };
        System.out.println(maxProd(nums1)); // Output: 6

        // Example 2
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(maxProd(nums2)); // Output: 24

        // Example 3
        int[] nums3 = { -1, -2, -3 };
        System.out.println(maxProd(nums3)); // Output: -6
    }
}