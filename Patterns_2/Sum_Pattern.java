package Patterns_2;

import java.util.Scanner;

public class Sum_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i <= N){
            int j = 1;
            int sum = 0;
            while(j <= i){
                System.out.print(j);
                if(j < i){
                    System.out.print("+");
                }
                sum += j;
                j++;
            }
            System.out.println("=" + sum);
            i++;
        }
        s.close();
    }
}
