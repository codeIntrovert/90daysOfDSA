// https://leetcode.com/problems/search-insert-position/

import java.util.Arrays;

public class insertPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        return index < 0 ? -index - 1 : index;
    }

}
