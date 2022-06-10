package Operators_and_For_Loop;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i*i <= N){
            i++;
        }
        System.out.print(i -1);
        s.close();
    }
}
