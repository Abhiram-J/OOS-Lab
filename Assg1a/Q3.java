import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int digits = 0;
        while ( n > 0){
            n/=10;
            digits++;
        }
        System.out.println(digits);
        sc.close();
    }
}
