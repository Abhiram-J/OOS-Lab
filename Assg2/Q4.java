import java.util.Scanner;

public class Q4 {
    public static boolean isPalindrome(String s){
        int n = s.length();
        for ( int i = 0; i < n >> 1; ++i){
            if (s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int maxi = 1;            
        for ( int i = 0; i < n; ++i){
            for ( int  j = i+1 ; j < n+1; ++j){
            //    System.out.println(i + " " + j + " " + s.substring(i,j));
                if ( isPalindrome(s.substring(i, j))){
                    maxi = Math.max(maxi, j-i);
                }
            }
        }
        System.out.println(maxi);
        sc.close();

    }
    
}
