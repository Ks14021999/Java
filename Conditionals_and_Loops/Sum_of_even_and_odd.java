package Conditionals_and_Loops;
import java.util.Scanner;

public class Sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int even = 0;
        int odd = 0;
        while(N != 0){
            if(N%2 == 0){
                even += N%10;
            }
            else{
                odd += N%10;
            }
            N /=10;
        }
        System.out.print(even +" " + odd);
        s.close();
    }
}
