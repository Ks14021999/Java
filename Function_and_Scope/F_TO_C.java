package Function_and_Scope;

import java.util.Scanner;

public class F_TO_C {
    private static void printFahrenheitTable(int s, int e, int w) {
        for(int i = s; i <= e; i = i + w){
            int celsius = (int)((i -32) * 5 / 9);
            System.out.println(i + " " +celsius);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        printFahrenheitTable(S, E, W);
    }

}
