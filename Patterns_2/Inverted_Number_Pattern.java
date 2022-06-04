package Patterns_2;

import java.util.Scanner;

public class Inverted_Number_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = N;
        while(i > 0){
            int j = i;
            while(j > 0){
                System.out.print(i);
                j--;
            }
            System.out.println("");
            i--;
        }
        s.close();
    }
}
