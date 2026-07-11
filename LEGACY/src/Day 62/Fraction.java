// https://leetcode.com/problems/simplified-fractions/description/

import java.util.*;

public class Fraction {
    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        
        for (int denominator = 2; denominator <= n; denominator++) {
            for (int numerator = 1; numerator < denominator; numerator++) {
                if (gcd(numerator, denominator) == 1) {
                    result.add(numerator + "/" + denominator);
                }
            }
        }
        
        return result;
    }
    
    // Function to calculate the greatest common divisor using Euclid's algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.simplifiedFractions(2)); // Output: ["1/2"]
        System.out.println(solution.simplifiedFractions(3)); // Output: ["1/2","1/3","2/3"]
        System.out.println(solution.simplifiedFractions(4)); // Output: ["1/2","1/3","1/4","2/3","3/4"]
    }
}
