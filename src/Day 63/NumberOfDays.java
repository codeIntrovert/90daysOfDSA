//https://leetcode.com/problems/day-of-the-year/description/

public class NumberOfDays {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));
        
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Account for leap years
        if (isLeapYear(year))
            daysInMonth[2] = 29;
        
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i];
        }
        
        return dayOfYear;
    }
    
    // Function to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dayOfYear("2019-01-09")); // Output: 9
        System.out.println(solution.dayOfYear("2019-02-10")); // Output: 41
    }
}
