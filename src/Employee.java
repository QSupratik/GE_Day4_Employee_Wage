public class Employee {
    int dailyAttendance;
    String type;
    int partTimeSal=0;

    Employee(String typeOfEmployee){
        this.type = typeOfEmployee;
    }

    public void calculateAttendance(){
        if(Math.random()<0.5){
            dailyAttendance = 0;
            System.out.println("Absent");
        }
        else{
            dailyAttendance = 1;
            System.out.println("Present");
        }
    }

    public static void dailyWage(){
        System.out.println("Daily wage is " + 8*20);
    }

    public void partTimeSal(int sal){
        this.partTimeSal=sal;
        System.out.println("The total part time salary is " + 8*sal);
    }

    public void monthlyWages(int sal){
        int days = 20;
        System.out.println("The total monthly salary is " + 8*sal*days);
    }

    public void conditionalWages(int hours, int days){
        if(hours>=100 && days>=20 && this.type.equals("full-time")){
            System.out.println("\nTotal wage is " + 20*hours);
        }
        else if(hours>=100 && days>=20 && this.type.equals("part-time")){
            System.out.println("\nTotal wage is " + partTimeSal*hours);
        }
        else{
            System.out.println("Minimum hours or days criterion not met\n");
        }
    }
}
