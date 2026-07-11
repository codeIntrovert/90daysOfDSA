import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the numbers and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[] { numMap.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            numMap.put(nums[i], i);
        }

        // No solution found, so return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output 2: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}
