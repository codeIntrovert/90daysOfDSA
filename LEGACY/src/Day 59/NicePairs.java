// https://leetcode.com/problems/count-nice-pairs-in-an-array/description/

class NicePairs{
    public int countNicePairs(int[] nums) {
        final int MOD = 1000000007;
        Map<Integer, Integer> map = new HashMap<>();
        long nicePairs = 0;
        
        for (int num : nums) {
            int revNum = reverse(num);
            int diff = num - revNum;
            nicePairs += map.getOrDefault(diff, 0);
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }
        
        return (int) (nicePairs % MOD);
    }
    
    private int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}