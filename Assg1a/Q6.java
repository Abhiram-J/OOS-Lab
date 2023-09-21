import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while ( n > 0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if ( original == rev) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sc.close();
    }
}
