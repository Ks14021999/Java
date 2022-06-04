package Patterns_2;

import java.util.Scanner;

public class Half_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        System.out.println("*");
        while(i <= N){
            int j = 1;
            if(i> 0){
                System.out.print("*");
            }
            while(j < i){
                System.out.print(j);
                j++;
            }
            while(j > 0){
                System.out.print(j);
                j--;
            }
            System.out.println("*");
            i++;
        }
        int j = N - 1;
        while(j > 0){
            int h = 1;
            if(j > 0){
                System.out.print("*");
            }
            while(h < j){
                System.out.print(h);
                h++;
            }
            while(h > 0){
                System.out.print(h);
                h--;
            }
            System.out.println("*");
            j--;
        }
        System.out.println("*");
        s.close();
    }
}
