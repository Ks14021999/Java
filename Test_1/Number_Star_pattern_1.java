package Test_1;

import java.util.Scanner;

public class Number_Star_pattern_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            int a = N;
            for(int j = N; j > i; j--){
                System.out.print(a--);
            }
            System.out.print("*");
            a --;
            for(int k =  1; k < i; k++){
                System.out.print(a--);
            }
            System.out.println("");
        }
        s.close();;
    }
}
