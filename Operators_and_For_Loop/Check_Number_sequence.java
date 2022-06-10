package Operators_and_For_Loop;

import java.util.Scanner;

public class Check_Number_sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int seq = 1;
        int d = b - a;
        for(int i =3; i <=N; i++){
            a = b;
            b = s.nextInt();
            if(b- a != d){
                seq = 0;
            }
        }
        if(seq == 0){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
        s.close();
    }
}
