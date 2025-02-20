
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
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][]dp = new int[n][n];
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
            arr[i][2]= kb.nextInt();
        }
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2])));
    }

}

