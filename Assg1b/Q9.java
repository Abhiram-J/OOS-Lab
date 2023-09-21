import java.util.Scanner;


public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if ( s.equals(t)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        sc.close();
    }
}
