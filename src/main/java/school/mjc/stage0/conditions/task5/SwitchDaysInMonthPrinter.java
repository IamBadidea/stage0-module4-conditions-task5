package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public static void main(String[] args) {
        SwitchDaysInMonthPrinter s = new SwitchDaysInMonthPrinter();
        s.amountOfDays(3);
    }
    public void amountOfDays(int month) {
        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 11:
                System.out.println(30);
                break;
            case 9:
                System.out.println(30);
                break;
            case 6:
                System.out.println(30);
                break;
            case 4:
                System.out.println(30);
                break;
            default:
                System.out.println(31);
                break;
        }
    }
}
