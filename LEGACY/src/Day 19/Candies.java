// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies among all kids
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Check if each kid can have the greatest number of candies after adding extra
        // candies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }

    public static void main(String[] args) {
        Candies solution = new Candies();

        int[] candies1 = { 2, 3, 5, 1, 3 };
        int extraCandies1 = 3;
        System.out.println("Output 1: " + solution.kidsWithCandies(candies1, extraCandies1)); // Output:
                                                                                              // [true,true,true,false,true]

        int[] candies2 = { 4, 2, 1, 1, 2 };
        int extraCandies2 = 1;
        System.out.println("Output 2: " + solution.kidsWithCandies(candies2, extraCandies2)); // Output:
                                                                                              // [true,false,false,false,false]

        int[] candies3 = { 12, 1, 12 };
        int extraCandies3 = 10;
        System.out.println("Output 3: " + solution.kidsWithCandies(candies3, extraCandies3)); // Output:
                                                                                              // [true,false,true]
    }
}
