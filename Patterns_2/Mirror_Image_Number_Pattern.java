package Patterns_2;

import java.util.Scanner;

public class Mirror_Image_Number_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i <= N){
            int j = N - i;
            while(j > 0){
                System.out.print(" ");
                j--;
            }
            j++;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println("");
            i++;
        }
        s.close();
    }
}
