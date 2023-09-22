import java.util.Scanner;

public class Q1 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (i != 0 && i != 4 && i != 8 && i != 14 && i != 20) {
                while(freq[i] > 0) {
                    System.out.print((char)(i + 'a'));
                    freq[i]--;
                }
            }
        }
        System.out.println();
     sc.close();
   } 
}
