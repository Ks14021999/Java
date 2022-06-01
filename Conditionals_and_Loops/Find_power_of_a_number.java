package Conditionals_and_Loops;
import java.util.Scanner;

public class Find_power_of_a_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int ans = 1;
        while(n > 0){
            ans *= x;
            n--;
        }
        System.out.print(ans);
        s.close();
    }
}
