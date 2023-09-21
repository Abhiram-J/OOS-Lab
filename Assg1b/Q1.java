import java.util.Scanner;

public class Q1 {
    private static boolean checkPalindrome(int n){
        int original = n;
        int rev = 0;
        while ( n > 0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( checkPalindrome(n)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        
        sc.close();
    }
}
