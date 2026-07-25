// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/


class Solution {
    public int countOdds(int low, int high) {
        // Total odds up to high minus total odds up to (low - 1)
        return (high + 1) / 2 - low / 2;
    }
}





// O(N) complexity
// class Solution {
//     public int countOdds(int low, int high) {
//         int n=high;
//         int k = 0;
//         for(int i=low;i<=n;i++){
//             if(i%2==0){
//                 continue;
//             }
//             else{
//                 k++;
//             }
//         }
//         return k;
//     }
// }
