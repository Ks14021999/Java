import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char grade = s.next().charAt(0);
        double hra = (.20 * basic);
        double da = (.50 * basic);
        double pf = (.11 * basic);
        double allow = 0;
        if(grade == 65) {
            allow = 1700;
        }
        else if(grade == 66){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        double totalSalary = (basic + hra + da + allow);
        totalSalary -= pf;
        System.out.println(Math.round(totalSalary));
    }
}
