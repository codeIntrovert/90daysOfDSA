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

}
