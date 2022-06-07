package Operators_and_For_Loop;

import java.util.Scanner;

public class Terms_of_AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            int ans = 3 * i + 2;
            if(ans % 4 ==0){
                N++;
            }
            else{
                System.out.print(ans + " ");
            }
        }
        s.close();
    }
}
