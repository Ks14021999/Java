package Patterns_2;

import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i <= N){
            int space = N - i -1;
            while(space > 0){
                System.out.print(" ");
                space--;
            }
            int star = 1;
            while(star <= i){
                System.out.print("*");
                star++;
            }
            star--;
            while(star > 1){
                System.out.print("*");
                star--;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
}
