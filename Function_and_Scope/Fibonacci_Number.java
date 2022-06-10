package Function_and_Scope;

import java.util.Scanner;


public class Fibonacci_Number {
    private static boolean checkMember(int n) {
        int F1 = 0;
        int F2 = 1;
        int F = 0;
        for(int i = 1; i <= n; i++){
            F = F1 + F2;
            if(F == n){
                return true;
            }
            F1 = F2;
            F2 = F;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.print(checkMember(N));
        s.close();
    }

}
