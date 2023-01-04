package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (!(month < 1 || month >= 13)) {
            if (month % 2 != 0 || month == 8) {
                System.out.println(31);
            } else {
                if (month == 2) {
                    System.out.println(28);
                } else {
                    System.out.println(30);
                }

            }
        } else {
            System.out.println("wrong number!");
        }

    }
}
