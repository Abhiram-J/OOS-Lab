import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    private static boolean isPrime(int n){
        if ( n == 2) {
            return true;
        }
        for ( int i = 2; i*i <= n ; i++){
            if ( n%i == 0) return false;
        }
        return true;

    }
    private static ArrayList<Integer> findPrimes(int a, int b){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for ( int i = a+1; i < b; ++i){
            if ( isPrime(i)){
                primes.add(i);
            }        
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer>  primes = findPrimes(a,b);
        for ( int i = 0; i < primes.size(); ++i){
            System.out.print(primes.get(i) + " ");
        }        
        System.out.println();
        sc.close();
    }
    
}
