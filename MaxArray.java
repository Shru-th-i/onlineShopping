import java.util.Arrays;

public class MaxArray {

    public static void main(String[] args) {
        int[] a={2,88,65};

        System.out.println(maxi(a));
    }
    static  int maxi(int[] arr) {
       /* int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }*/

           int max=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[max]) {
                max = i;
            }
        }
            return arr[max];

    }
}
