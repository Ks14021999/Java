package Patterns_1;

import java.util.Scanner;

public class Triangular_Star_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        s.close();
    }
}
