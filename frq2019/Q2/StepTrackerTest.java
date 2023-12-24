package frq2019.Q2;

/*
 * The following class should not has any error after the correct implemtation of
 * StepTracker class.
 */
public class StepTrackerTest {
    public static void main(String[] args) {
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays() == 0);
        System.out.println(tr.averageSteps() == 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays() == 0);
        System.out.println(tr.averageSteps() == 7000.0);
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays() == 1);
        System.out.println(tr.averageSteps() == 9000.0);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println(tr.activeDays() == 2);
        System.out.println(tr.averageSteps() == 10222.2);
    }
}
