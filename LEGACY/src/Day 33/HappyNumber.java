// Source: https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public boolean isHappy(int n) {
        if (n == 1 || n == 7)
            return true;
        else if (n <= 9)
            return false;
        int pro = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            pro += (rem * rem);
        }
        return isHappy(pro);
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();

        // Example 1
        int n1 = 19;
        System.out.println(solution.isHappy(n1)); // Output: true

        // Example 2
        int n2 = 2;
        System.out.println(solution.isHappy(n2)); // Output: false
    }
}
