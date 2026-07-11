public class removeElement {
    public int removeElementFunc(int[] nums, int val) {
        int k = 0; // Initialize count of elements not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i]; // Move elements not equal to val to the front
            }
        }
        return k; // Return the count of elements not equal to val
    }

    public static void main(String[] args) {
        removeElement solution = new removeElement();

        // Example 1
        int[] nums1 = { 3, 2, 2, 3 };
        int val1 = 3;
        System.out.println(solution.removeElementFunc(nums1, val1)); // Output: 2

        // Example 2
        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        System.out.println(solution.removeElementFunc(nums2, val2)); // Output: 5
    }
}
