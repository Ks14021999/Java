package Patterns_2;

import java.util.Scanner;

public class Diamond_of_stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int upper_half = N/2 + 1;
        int i = 1;
        while(i <= upper_half){
            int space = upper_half - i;
            while(space > 0){
                System.out.print(" ");
                space--;
            }
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            j--;
            while(j >1){
                System.out.print("*");
                j--;
            }
            System.out.println("");
            i++;
        }
        int a = 1;
        while(a < upper_half){
            int space = 1;
            while(space <= a){
                System.out.print(" ");
                space++;
            }
            int j = upper_half - a;
            while(j > 0){
                System.out.print("*");
                j--;
            }
            int k = 1;
            while(k < upper_half - a){
                System.out.print("*");
                k++;
            }
            System.out.println("");
            a++;
        }
        s.close();
    }
}
