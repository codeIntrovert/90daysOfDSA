public class findGCD {
    public static int GCD(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(max, min);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 2, 5, 6, 9, 10 };
        System.out.println(GCD(nums1)); // Output: 1

        // Example 2
        int[] nums2 = { 7, 5, 6, 8, 3 };
        System.out.println(GCD(nums2)); // Output: 1

    }
}
