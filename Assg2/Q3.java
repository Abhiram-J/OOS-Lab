import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] cnt = new int[128];

        for ( int i = 0; i < s.length(); ++i){
            if (cnt[(int)s.charAt(i)] == 0){
                cnt[(int)s.charAt(i)] = 1;
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        sc.close();

    }
    
}
