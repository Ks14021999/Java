package Patterns_1;

import java.util.Scanner;

public class Alpha_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        char a = 'A';
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a);
            }
            a++;
            System.out.println("");
        }
        s.close();
    }
}
