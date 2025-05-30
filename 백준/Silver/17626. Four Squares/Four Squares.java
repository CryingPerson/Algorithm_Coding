import java.util.*;

public class Main {
    static int N;
    static int[][] graph;
    static int[][] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]dp = new int[n+1];

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 0; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
