import java.util.*;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, swap it with the element at nonZeroIndex
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                // Move the nonZeroIndex pointer forward
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = { 0, 1, 0, 3, 12 };
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        // Example 2
        int[] nums2 = { 0 };
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
}
