import java.util.Scanner;

public class EmployeeWage {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter the type of employee\n");
            String typeOfEmployee = ip.next();
            Employee e1 = new Employee(typeOfEmployee);

            //Checking employee attendance
            e1.calculateAttendance();

            //Calculating Employee daily wage or part-time wage
            switch (typeOfEmployee){
                case "full-time":
                    e1.dailyWage();
                    e1.monthlyWages(20);
                    break;
                case "part-time":
                    System.out.println("Enter the part-time salary ");
                    int sal = ip.nextInt();
                    e1.partTimeSal(sal);
                    e1.monthlyWages(sal);
                    break;
                default:
                    System.out.println("Enter valid employee type\n");
                    return;
            }

            //Conditional Wage Calculation
            System.out.println("Enter the total working hours");
            int hours = ip.nextInt();
            System.out.println("Enter the total number of days");
            int days = ip.nextInt();
            e1.conditionalWages(hours, days);

            //Utilizing class methods
            System.out.println("\nUtilizing class methods\n");
            Employee.dailyWage();
        }
}
