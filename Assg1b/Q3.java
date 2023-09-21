import java.util.Scanner;

public class Q3 {
    private static int sumOfNaturalNumbers(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
        sc.close();
    }
}
