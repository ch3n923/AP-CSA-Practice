public class APCalendar{
    public static boolean isLeapYear(int year){
        return (year % 100 == 0 && year % 400 == 0) || year % 4 == 0 ? true : false;
    }

    public static int numberOfLeapYears(int year1, int year2){
        return 0;
        //TODO: to be implementing in part (a)
    }

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

    public static int dayOfWeek(int month, int day, int year){
        return 0;
        //TODO: to be implemented in part(b)
    }

    
}