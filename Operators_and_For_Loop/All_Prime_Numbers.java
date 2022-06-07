package Operators_and_For_Loop;

import java.util.Scanner;

public class All_Prime_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 2; i <= N; i++){
            int flag = 0;
            for(int j = 2; j < i; j++){
                if(i % j ==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
        }
        s.close();
    }
}
