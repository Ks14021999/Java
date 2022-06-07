package Operators_and_For_Loop;

import java.util.Scanner;

public class Reverse_of_a_number {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int RN = 0;
        int i = 1;
        while(N == 0){
            int temp = N % 10;
            RN = (RN * i) + temp; 
            i *= 10;
            N /= 10;
        }
        System.out.print(RN);
        s.close();
    }
}
