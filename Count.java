import java.util.Arrays;

class Count{
    static int[] hash;
    //Function to count the frequency of all elements from 1 to N in the array.

    public static void main(String[] args) {
        int[] a={3,2,2,2,1};
        int N=5,P=3;
        frequencyCount(a,N,P);

    }
    public static void frequencyCount(int arr[], int N, int P)
    {
        hash=new int[P+1];
        System.out.println(Arrays.toString(hash));
        for(int i=0;i<N;i++){
            hash[arr[i]]=hash[arr[i]]+1;

        }
        for (int i = 1; i <=5 ; i++) {
            System.out.print(hash[i]+" ");
        }
    }

}
