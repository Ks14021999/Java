package Conditionals_and_Loops;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 2; i < N; i ++){
            if(N % i == 0){
                System.out.print(i + " ");
            }
        }
        s.close();
    }
}
