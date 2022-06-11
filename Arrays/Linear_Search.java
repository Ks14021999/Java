package Arrays;

import java.util.*;

public class Linear_Search {

    private static int search(int[] array, int n) {
        int output = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                output = array[i];
            }
        }
        return output;
    }

    private static void takeinput(int[] array) {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i <array.length; i++){
            int temp = s.nextInt();
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int no_of_arrays = s.nextInt();
        for(int i = 0; i < no_of_arrays; i++){
            int size = s.nextInt();
            int array[] = new int[size];
            takeinput(array);
            int n = s.nextInt();
            System.out.println(search(array, n));
        }
        s.close();
    }

    
}
