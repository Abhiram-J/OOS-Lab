import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix 1 ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Enter the first matrix");
        int[][] matrix1 = new int[n][m];
        for ( int i = 0; i < n ; ++i){
            for ( int j = 0; j < m ; ++j){
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the dimensions of matrix 2 ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println("Enter the second matrix");
        int[][] matrix2 = new int[p][q];
        for ( int i = 0; i < p ; ++i){
            for ( int j = 0; j < q ; ++j){
                matrix2[i][j] = sc.nextInt();
            }
        }
        if ( m != p) {
            System.out.println("Matrix multiplication is not possible");
        }else{
            int[][] ans = new int[n][q];
            for ( int i = 0; i < n; ++i){
                for ( int j = 0; j < q; ++j){
                    for ( int k = 0; k < m; ++k){
                        ans[i][j] += matrix1[i][k]*matrix2[k][j]; 
                    }
                }
            }
            System.out.println("The final matrix is ");
            for (int i = 0; i < n; ++i){
                for ( int j = 0; j < q; ++j){
                    System.out.print(ans[i][j] +" ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
