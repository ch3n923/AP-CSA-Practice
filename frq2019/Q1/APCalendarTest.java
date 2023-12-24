public class APCalendarTest {
    public static void main(String[] args) {
        testNumberOfLeapYears();
        testDayOfWeek();
    }

    public static void testNumberOfLeapYears() {
        System.out.println(APCalendar.numberOfLeapYears(2000, 2004) == 2);
        System.out.println(APCalendar.numberOfLeapYears(2000, 2100) == 25);
        System.out.println(APCalendar.numberOfLeapYears(2000, 2000) == 1);
        System.out.println(APCalendar.numberOfLeapYears(2001, 2004) == 1);
    }

    public static void testDayOfWeek() {
        System.out.println(APCalendar.dayOfWeek(1, 1, 2000) == 5);
        System.out.println(APCalendar.dayOfWeek(12, 31, 2000) == 0);
        System.out.println(APCalendar.dayOfWeek(2, 29, 2000) == 2);
        System.out.println(APCalendar.dayOfWeek(2, 28, 2001) == 3);
    }
}