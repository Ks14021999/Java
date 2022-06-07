package Operators_and_For_Loop;

import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int B = 0;
        int i = 1;
        while(N != 0){
            int temp = N % 2;
            B = temp * i + B;
            i *= 10;
            N /= 2;
        }
        System.out.print(B);
        s.close();
    }
}
