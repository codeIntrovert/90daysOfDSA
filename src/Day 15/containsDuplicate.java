import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/description/
public class containsDuplicate {
    public static boolean containsDuplicateCheck(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }
            set.add(num);
        }

        return false; // No duplicates found
    }

    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Output 1: " + containsDuplicateCheck(nums1)); // Output: true

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Output 2: " + containsDuplicateCheck(nums2)); // Output: false

        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Output 3: " + containsDuplicateCheck(nums3)); // Output: true
    }
}
