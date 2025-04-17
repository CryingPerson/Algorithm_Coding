import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[] ans;
    static char[][] board;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if(flag(s)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean flag(String str){

        boolean[] alpabet = new boolean[26];
        alpabet[str.charAt(0) - 'a'] = true;
        for(int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(alpabet[ch - 'a'] && ch != str.charAt(i-1)){
                return false;
            }
            alpabet[ch - 'a'] = true;
        }
        return true;
    }
}
