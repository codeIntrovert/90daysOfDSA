//https://leetcode.com/problems/count-days-spent-together/submissions/1184218999/

public class DaysSpentTogether {
    public int daysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        // Parse dates
        int startAlice = toDayOfYear(arriveAlice);
        int endAlice = toDayOfYear(leaveAlice);
        int startBob = toDayOfYear(arriveBob);
        int endBob = toDayOfYear(leaveBob);
        
        // Counter for days together
        int daysTogether = 0;
        
        // Iterate through each day of the year
        for (int day = 1; day <= 365; day++) {
            // Check if the day falls within both Alice and Bob's stay
            if (day >= startAlice && day <= endAlice && day >= startBob && day <= endBob) {
                daysTogether++;
            }
        }
        
        return daysTogether;
    }
    
    // Helper function to convert date string to day of year
    private int toDayOfYear(String date) {
        String[] parts = date.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysPerMonth[i];
        }
        dayOfYear += day;
        
        return dayOfYear;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.daysTogether("08-15", "08-18", "08-16", "08-19")); // Output: 3
        System.out.println(solution.daysTogether("10-01", "10-31", "11-01", "12-31")); // Output: 0
    }
}
