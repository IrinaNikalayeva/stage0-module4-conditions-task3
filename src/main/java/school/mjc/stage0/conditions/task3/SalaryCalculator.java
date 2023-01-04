package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double newSalary;
        if (salary >= 0) {
            if (salary <= 10000) {
                newSalary = (salary - salary * 0.15);
            } else if (salary <= 20000) {
                newSalary = (salary - salary * 0.18);
            } else {
                newSalary = (salary - salary * 0.2);
            }
            System.out.println(newSalary);
        } else {
            System.out.println("wrong input!");
        }

    }
}
