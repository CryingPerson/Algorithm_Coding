import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] board;

    static int result = 0;
    static int n;
    static int[][] triangle;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] dp = new int[n][n];
        int[][] cost = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][0] = sc.nextInt();
            dp[i][1] = sc.nextInt();
            dp[i][2] = sc.nextInt();
        }
        cost[0][0] = dp[0][0];
        cost[0][1] = dp[0][1];
        cost[0][2] = dp[0][2];

        for (int i = 1; i < n; i++) {
            cost[i][0] = dp[i][0] + Math.min(cost[i-1][1], cost[i-1][2]);
            cost[i][1] = dp[i][1] + Math.min(cost[i-1][0], cost[i-1][2]);
            cost[i][2] = dp[i][2] + Math.min(cost[i-1][0], cost[i-1][1]);
        }

        System.out.println(Math.min(cost[n-1][0], Math.min(cost[n-1][1], cost[n-1][2])));
    }
}
