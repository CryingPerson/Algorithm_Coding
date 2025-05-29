import java.io.IOException;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    static int[] rank = {1,2,3,4,5,6};
    static int[] rank2 = {1,2,4,8,16};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[26];
       for(int i = 0; i < n; i++) {
           String s = sc.next();
           char c = s.charAt(0);
           arr[c - 'a']++;
       }

       String answer = "";

       for(int i = 0; i < 26; i++) {
           if(arr[i] >= 5){
               char ch = (char)(i + 'a');
                answer += ch;
           }
       }
       if(answer.equals("")) {
           System.out.println("PREDAJA");
           return;
       }
        System.out.println(answer);
    }
}
