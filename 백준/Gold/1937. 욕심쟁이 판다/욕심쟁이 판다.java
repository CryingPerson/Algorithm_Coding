import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    static String s;
    static int[] arr;
    static int n, m, x, y;
    static boolean[] visited;

    static Set<Integer> ans = new HashSet<>();
    static int[] dist;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] home;
    static int[][] board;
    static int[] belt;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(i, j));
            }
        }
        System.out.println(max);
    }

    static int dfs(int x, int y) {
        if(dp[x][y] != 0) return dp[x][y];

        dp[x][y] = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (board[nx][ny] > board[x][y]) {
                    dp[x][y] = Math.max(dp[x][y], dfs(nx,ny) + 1);
                }
            }
        }
        return dp[x][y];
    }
}