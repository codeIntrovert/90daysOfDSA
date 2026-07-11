public class majorityElement {

    public static int majorityElementFunc(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 3, 2, 3 };
        System.out.println(majorityElementFunc(nums1)); // Output: 3

        // Example 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElementFunc(nums2)); // Output: 2
    }
}