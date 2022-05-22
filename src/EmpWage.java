import java.util.Random;

public class EmpWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");


        Random random = new Random();

        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 4;
        int wagePerDay = 0;
        int monthlySalary = 0;
        int monthlyHours = 0;
        int days = 0;

        while (days !=20 && monthlyHours !=100) {
       

            int attendance = random.nextInt(3);
            wagePerDay = 0;
            switch (attendance) {
            case 0:
                System.out.println("Employee Absent.");
                break;
            case 1:
                wagePerDay = partTimeHours * wagePerHour;
                monthlyHours = monthlyHours + partTimeHours;
                break;
            default:
                wagePerDay = fullDayHours * wagePerHour;
                monthlyHours = monthlyHours + fullDayHours;

            }
            monthlySalary = monthlySalary + wagePerDay;

            System.out
                    .println("Day: " + days + " Monthly Hours: " + monthlyHours + " Monthly Salary: " + monthlySalary);
            days++;
        }

    }
}
