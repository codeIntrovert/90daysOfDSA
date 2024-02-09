// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class removeDuplicates {
    public int removeDuplicatesfunc(int[] nums) {
        if (nums.length == 0) {
            return 0; // Return 0 if the array is empty
        }

        int uniqueIndex = 1; // Pointer to the position where the next unique element should be placed

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous element,
            // move it to the position indicated by uniqueIndex
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex++] = nums[i];
            }
        }

        return uniqueIndex; // Return the number of unique elements
    }

    public static void main(String[] args) {
        removeDuplicates solution = new removeDuplicates();

        int[] nums1 = { 1, 1, 2 };
        int k1 = solution.removeDuplicatesfunc(nums1);
        System.out.println("Output 1: " + k1); // Output: 2

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = solution.removeDuplicatesfunc(nums2);
        System.out.println("Output 2: " + k2); // Output: 5
    }
}
