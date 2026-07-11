public class search2D {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        // Check for edge cases
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // If the current element equals the target, return true
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }

        // If the target is not found in any element, return false
        return false;
    }
}
