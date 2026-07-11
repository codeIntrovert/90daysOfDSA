// https://leetcode.com/problems/find-the-k-beauty-of-a-number/
public class BeautyNumber {
    public int kBeauty(int num, int k) {
        // Convert num to string
        String numStr = Integer.toString(num);
        
        // Counter to keep track of k-beauty substrings
        int count = 0;
        
        // Iterate through all substrings of length k
        for (int i = 0; i <= numStr.length() - k; i++) {
            String substr = numStr.substring(i, i + k);
            
            // Convert substring back to integer
            int subNum = Integer.parseInt(substr);
            
            // Check if subNum is a divisor of num and not 0
            if (subNum != 0 && num % subNum == 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kBeauty(240, 2)); // Output: 2
        System.out.println(solution.kBeauty(430043, 2)); // Output: 2
    }
}
