package Test_1;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int temp = N;
        int RN = 0;
        while(temp != 0){
            RN = RN * 10 + temp%10;
            temp /= 10;
        }
        if(RN == N){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        s.close();
    }
}
