package Arrays;

import java.util.Scanner;

public class Return_Array_Sum {
    private static void takeinput(int[] array) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i <array.length; i++){
            int temp = s.nextInt();
            array[i] = temp;
        }
        s.close();
    }
    private static int sum(int[] array) {
        int sum =0;
        for(int i = 0; i <array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_array = s.nextInt();
        for(int i = 1; i <= no_of_array; i++){
            int size = s.nextInt();
            int array[] = new int[size];
            takeinput(array);
            System.out.println(sum(array));
        }
        s.close();
    }
}
