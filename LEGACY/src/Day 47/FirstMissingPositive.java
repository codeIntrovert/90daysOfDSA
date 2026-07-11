import java.util.Arrays;

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums); // Sorting the array

        int n = nums.length;

        // Handling edge cases
        if (n == 0 || nums[n - 1] <= 0) {
            return 1;
        }

        int smallestMissing = 1;

        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // If the current element is negative or zero, continue to the next element
            if (nums[i] <= 0) {
                continue;
            }

            // If the current element is larger than the smallest missing positive, return
            // the smallest missing positive
            if (nums[i] > smallestMissing) {
                return smallestMissing;
            }

            // If the current element is equal to the smallest missing positive, increment
            // the smallest missing positive
            if (nums[i] == smallestMissing) {
                smallestMissing++;
            }
        }

        return smallestMissing;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] nums1 = { 1, 2, 0 };
        System.out.println(solution.firstMissingPositive(nums1)); // Output: 3

        int[] nums2 = { 3, 4, -1, 1 };
        System.out.println(solution.firstMissingPositive(nums2)); // Output: 2

        int[] nums3 = { 7, 8, 9, 11, 12 };
        System.out.println(solution.firstMissingPositive(nums3)); // Output: 1
    }
}
