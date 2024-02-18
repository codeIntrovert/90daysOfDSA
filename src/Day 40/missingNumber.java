public class missingNumber {
    public static int missingNumberCheck(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 3, 0, 1 };
        System.out.println(missingNumberCheck(nums1)); // Output: 2

        // Example 2
        int[] nums2 = { 0, 1 };
        System.out.println(missingNumberCheck(nums2)); // Output: 2

        // Example 3
        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumberCheck(nums3)); // Output: 8

        // Example 4
        int[] nums4 = { 0 };
        System.out.println(missingNumberCheck(nums4)); // Output: 1
    }
}
