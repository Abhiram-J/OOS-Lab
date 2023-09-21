import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for ( int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == ' ') cnt++;
        }
        System.out.println("Words count is " + (cnt+1));
        for ( int i = 0; i < s.length(); ++i){
            System.out.println("'"+s.charAt(i)+"' " + (int)s.charAt(i));
        }
        sc.close();

    }
    
}
