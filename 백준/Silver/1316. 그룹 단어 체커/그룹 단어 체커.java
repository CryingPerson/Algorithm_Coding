
import java.awt.*;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int[][] board;
    static int[][] dis;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] ans;
    static int zero = 0;
    static int[] arrs;
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = kb.nextLine();
            if(check(s))cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean check(String s) {
        char preChar = 0;
        boolean[] word = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if(curChar != preChar && word[curChar - 'a']){
                return false;
            }
            word[curChar - 'a'] = true;
            preChar = curChar;

        }
        return true;
    }
}

