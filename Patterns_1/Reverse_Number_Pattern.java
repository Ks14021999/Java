package Patterns_1;

import java.util.Scanner;

public class Reverse_Number_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j =i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
        s.close();
    }
}
