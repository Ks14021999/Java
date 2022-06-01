import java.util.Scanner;

public class Average_Marks{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(str);
        System.out.println((a + b + c)/ 3);
    }
}
