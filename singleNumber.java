/* 136. Single Number
 *  In This program we will be given an array,
 *  we will need to return the only "single number" in the array
 *  we will use XOR operator here 
 */

public class singleNumber {
    public static void main(String[] args) {
        int[] inputs = { 2, 2, 4, 1, 4 };
        System.out.println(singleNumber(inputs));
    }

    public static int singleNumber(int nums[]) {
        int result = 0;
        // XOR
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
