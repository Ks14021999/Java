package Patterns_2;

import java.util.Scanner;

public class Parallelogram_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 0;
        while(i < N){
            int j = 0;
            int space = 0;
            while(space < i){
                System.out.print(" ");
                space++;                
            }
            while(j < N){
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
}
