package Patterns_1;

import java.util.Scanner;

public class Character_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        char a = 'A';
        int i = 1;
        while(i <= N){
            char b = a;
            int j = 1;
            while(j <= i){
                System.out.print(b++);
                j++;
            }
            a++;
            System.out.println("");
            i++;
        }
        s.close();
    }    
}
