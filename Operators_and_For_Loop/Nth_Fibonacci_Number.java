package Operators_and_For_Loop;

import java.util.Scanner;

public class Nth_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int F1 = 1;
        int F2 = 1;
        int fib = 1;
        for(int i = 3; i <= N; i++){
            fib = F1 + F2;
            F1 = F2;
            F2 = fib;
        }
        System.out.println(fib);
        s.close();
    }
    
}
