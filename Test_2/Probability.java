package Test_2;

import java.util.Scanner;

public class Probability {
    private static int probability(int n, int x) {
        double totaln = ncr(8, n);
        double totalx = ncr(4, x);
        double totalnx = ncr(4, n-x);
        double total = ((totalnx * totalx) / totaln);
        return (int) (total * 100);
    }
    private static double ncr(int n, int x) {
        double factn = 1;
        double factx = 1;
        double factnx = 1;
        for(int i = 1; i<=n; i++){
            factn *= i;
            if(i == x){
                factx = factn;
            }
            if(i == n-x){
                factnx = factn;
            }
        }
        return (factn / (factnx * factx));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        System.out.print(probability(N, X));
        s.close();
    }

    
}
