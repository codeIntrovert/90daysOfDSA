//https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        // Iterate through the flowerbed array
        for (int i = 0; i < length; i++) {
            // Check if the current plot is empty and its adjacent plots are also empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                count++; // Increment the count of planted flowers
            }
        }

        // Check if the required number of flowers can be planted
        return count >= n;
    }

    public static void main(String[] args) {
        CanPlaceFlowers FlowerCheck = new CanPlaceFlowers();

        int[] flowerbed1 = { 1, 0, 0, 0, 1 };
        int n1 = 1;
        System.out.println("Output 1: " + FlowerCheck.canPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed2 = { 1, 0, 0, 0, 1 };
        int n2 = 2;
        System.out.println("Output 2: " + FlowerCheck.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}
