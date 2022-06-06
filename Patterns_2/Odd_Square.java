package Patterns_2;

import java.util.Scanner;

public class Odd_Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i <= N){
            int j = i;
            while(j <= N){
                System.out.print((2 * j) - 1);
                j++;
            }
            int again = 1;
            while(again < i){
                System.out.print((2 * again) - 1);
                again++;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
}
