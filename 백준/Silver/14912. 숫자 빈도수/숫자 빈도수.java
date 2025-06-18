import java.util.*;

public class Main {
    static int[] dx = {0, 1}; // 오른쪽, 아래
    static int[] dy = {1, 0};
    static int[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
             cnt += get(String.valueOf(i), k);
        }
        System.out.println(cnt);
    }

    static int get(String s, int k) {
        int cnt = 0;
        String s1 = String.valueOf(k);
        for (int i = 0; i < s.length(); i++) {
            if(s1.equals(String.valueOf(s.charAt(i)))) cnt++;
        }
        return cnt;
    }
}