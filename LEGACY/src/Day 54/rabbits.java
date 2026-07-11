// https://leetcode.com/problems/rabbits-in-forest/

class rabbits {
    public int numRabbits(int[] answers) {
        int[] count = new int[1000];
        int res = 0;
        for (int i : answers) {
            if (count[i] % (i + 1) == 0) {
                res += i + 1;
            }
            count[i]++;
        }
        return res;
    }
}

// explaination
// In a forest, each rabbit has some color. Some subset of rabbits (possibly all
// of them) tell you how many other rabbits have the same color as them. Those
// answers are placed in an array.

// we make a count array of size 1000 and then we iterate through the answers
// array and check if the count of the current answer is divisible by the answer
// + 1 then we add the answer + 1 to the result and then increment the count of
// the current answer. At the end we return the result.
// Time complexity: O(n)