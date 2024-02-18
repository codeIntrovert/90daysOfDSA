import java.util.Arrays;

public class mergeArray {
    // given two sorted arrays, merge them into a single sorted array

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);

        return nums1;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n))); // Output: [1, 2, 2, 3, 5, 6]

        // Example 2
        int[] nums3 = { 1 };
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;
        System.out.println(Arrays.toString(merge(nums3, m1, nums4, n1))); // Output: [1]
    }
}
