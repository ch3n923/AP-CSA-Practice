/**
 * This class provides methods for calendar calculations.
 * @author zipeng zheng
 * 
 */
public class APCalendar{
    /**
     * Checks if a year is a leap year.
     *
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /**
     * Calculates the number of leap years between two years.
     *
     * @param year1 the start year
     * @param year2 the end year
     * @return the number of leap years between year1 and year2
     */
    public static int numberOfLeapYears(int year1, int year2){
        return 0;
        //TODO: to be implementing in part (a)
    }

    /**
     * Calculates the day of the week for the first day of a year.
     *
     * @param year the year
     * @return the day of the week, where 0 represents Sunday, 1 represents Monday, etc.
     */
    public static int firstDayOfYear(int year){
        //By calulating with Zeller's congurence
        int m = 13;
        year--;
        int q = 1;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h)
        {
            case 0 : h = 6; break;
            case 1 : h = 0; break; 
            case 2 : h = 1; break; 
            case 3 : h = 2; break; 
            case 4 : h = 3; break; 
            case 5 : h = 4; break; 
            case 6 : h = 5; break; 
        }
        return h;
    }

    /**
     * Calculates the day of the year for a given date.
     *
     * @param month the month of the date
     * @param day the day of the date
     * @param year the year of the date
     * @return the day of the year
     */
    public static int dayOfYear(int month, int day, int year){
        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;
        switch (h)
        {
            case 0 : h = 6; break;
            case 1 : h = 0; break; 
            case 2 : h = 1; break; 
            case 3 : h = 2; break; 
            case 4 : h = 3; break; 
            case 5 : h = 4; break; 
            case 6 : h = 5; break; 
        }
        return h;
    }

    /**
     * Calculates the day of the week for a given date.
     *
     * @param month the month of the date
     * @param day the day of the date
     * @param year the year of the date
     * @return the day of the week, where 0 represents Sunday, 1 represents Monday, etc.
     */
    public static int dayOfWeek(int month, int day, int year){
        return 0;
        //TODO: to be implemented in part(b)
    }

    
}