// https://leetcode.com/problems/number-of-good-pairs/description/

class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int res = 0;
        for (int i : nums) {
            res += count[i]++;
        }
        return res;
    }
}