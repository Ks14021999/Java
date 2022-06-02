package Patterns_1;

import java.util.Scanner;

public class Square_Pattern{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print(N);
            }
            System.out.println("");
        }
        s.close();
    }
}