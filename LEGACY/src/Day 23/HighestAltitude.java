public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // Initialize the maximum altitude
        int currentAltitude = 0; // Initialize the current altitude

        // Traverse the gain array to compute altitudes
        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i]; // Update the current altitude
            maxAltitude = Math.max(maxAltitude, currentAltitude); // Update the maximum altitude
        }

        return maxAltitude; // Return the highest altitude
    }

    public static void main(String[] args) {
        HighestAltitude ha = new HighestAltitude();

        // Test cases
        int[] gain1 = { -5, 1, 5, 0, -7 };
        System.out.println("Output: " + ha.largestAltitude(gain1)); // Expected: 1

        int[] gain2 = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println("Output: " + ha.largestAltitude(gain2)); // Expected: 0
    }
}
