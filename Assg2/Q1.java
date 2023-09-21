import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0; i< n; ++i ){
            arr[i] = sc.nextInt();
        }
        int sz = 0;
        for ( int i = 0 ; i < n; ){
                int j = i, cnt = 0;
                while(j < n && arr[i] == arr[j]){
                    j++;cnt++;
                }
                sz += Math.min(cnt,2);
                i = j;                
        }
        System.out.println("The length of the original array is: " + n);
        System.out.println("After removing duplicates, the new length of the array is: " + sz);
        
        sc.close();

    }
}