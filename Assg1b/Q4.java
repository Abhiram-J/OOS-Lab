import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for ( int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        for ( int i = 0; i < n; ++i){
            if ( arr[i] == key) {
                System.out.println("Element found at index " + i);
                sc.close();
                return;
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}
