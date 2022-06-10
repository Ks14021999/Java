package Test_2;

import java.util.Scanner;

public class Number_Star_Pattern {
    private static void pattern(int N){
        for(int i = 1; i <=N; i++){
            for(int j = 1; j <= N - i +1; j++){
                System.out.print(j);
            }
            for(int k = 1; k <i ; k++){
                System.out.print("**");
            }
            int l = N;
            for(l = N - i + 1; l>=1 ; l--){
                System.out.print(l);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        pattern(N);
        s.close();
    }
}
