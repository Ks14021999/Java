package Test_1;

import java.util.Scanner;

public class Check_AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int d = b-a;
        int AP = 1;
        for(int i = 3; i <= N; i++){
            a = b ;
            b = s.nextInt();
            if(b - a != d){
                AP = 0;
            }
        }
        if(AP == 1){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        s.close();
    }
}
