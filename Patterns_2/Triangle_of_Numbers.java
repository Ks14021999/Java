package Patterns_2;

import java.util.Scanner;

public class Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i <= N){
            int space = N - i -1;
            int a = i;
            while(space >= 0){
                System.out.print(" ");
                space--;
            }
            int star = 1;
            while(star <= i){
                System.out.print(a++);
                star++;
            }
            star--;
            a--;
            while(star > 1){
                System.out.print(--a);
                star--;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
}
