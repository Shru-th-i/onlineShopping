import java.util.Arrays;
import java.util.Scanner;

public class PrintArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int [3];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();

        }
        num[0]=99;
        System.out.println(Arrays.toString(num));
    }
}
