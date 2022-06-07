package Operators_and_For_Loop;

import java.util.Scanner;

public class Sum_or_Product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int C = s.nextInt();
        if(C == 1){
            int Sum = 0;
            for(int i = 1; i <= N; i++){
                Sum += i;
            }
            System.out.print(Sum);
        }
        else if(C == 2){
            int product = 1;
            for(int i = 1; i <= N; i++){
                product *= i;
            }
            System.out.print(product);
        }
        else{
            System.out.print(-1);
        }
        s.close();
    }
}
