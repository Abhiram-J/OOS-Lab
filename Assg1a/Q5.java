import java.util.Scanner;


public class Q5 {
    private static int[] sortArray(int[] arr, int n){
        for ( int i = 0; i < n ; ++i){
            for ( int j = i+1; j < n; ++j){
                if ( arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for ( int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }

        int[] sortedArr = sortArray(arr,n);
         for ( int i = 0; i < n; ++i){
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}