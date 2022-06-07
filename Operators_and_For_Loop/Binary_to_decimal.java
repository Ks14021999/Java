package Operators_and_For_Loop;

import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int D = 0;
        int i = 1;
        while(N != 0){
            int temp = N % 10;
            D += temp * i;
            i *= 2;
            N /=10;
        }
        System.out.print(D);
        s.close();
    }
}
