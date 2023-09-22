import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        TreeSet<Integer> set= new TreeSet<Integer>();
        String s = sc.nextLine();
        Scanner sc2 = new Scanner(s);
        while(sc2.hasNextInt()){
            int n = sc2.nextInt();
            arr.add(n);
            set.add(n);
        }
        sc2.close();
        int cnt = 0;
        for ( int i = 0; i < arr.size(); i++) {
            for ( int j = i + 1; j < arr.size(); j++) {
                if(set.contains(arr.get(i) + arr.get(j))){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        sc.close();
    }
}
