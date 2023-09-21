import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstMaxi = -1 , secondMaxi = -1 , temp;
        for ( int i = 0; i < n ; ++i){
            temp = sc.nextInt();
            if( temp > firstMaxi){
                secondMaxi = firstMaxi;
                firstMaxi = temp;
            } else if ( temp > secondMaxi){
                secondMaxi = temp;
            }
        }
        System.out.println("Second Maximum is " + secondMaxi);
        sc.close();
    }
}
