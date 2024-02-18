import java.util.Arrays;

public class concentationArray {
    // very easy
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums1))); // Output: [1, 2, 1, 1, 2, 1]

        // Example 2
        int[] nums2 = { 1, 3, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums2))); // Output: [1, 3, 2, 1, 1, 3, 2, 1]
    }
}