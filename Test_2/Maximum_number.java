package Test_2;

import java.util.Scanner;

public class Maximum_number {
    private static int max_no(int n) {
        int k = 1;
        int max = 0;
        for(int i = 1; i <= 4; i++){
            int n1 = n;
            int temp = n1 % k + (n1 / (k*10))*k;
            if(temp > max){
                max = temp;
            }
            k *= 10;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println(max_no(N));
    }

}
