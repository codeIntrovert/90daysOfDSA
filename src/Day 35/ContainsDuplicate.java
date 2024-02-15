// https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        // Example 1
        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println(solution.containsDuplicate(nums1)); // Output: true

        // Example 2
        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(solution.containsDuplicate(nums2)); // Output: false

        // Example 3
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(solution.containsDuplicate(nums3)); // Output: true
    }
}