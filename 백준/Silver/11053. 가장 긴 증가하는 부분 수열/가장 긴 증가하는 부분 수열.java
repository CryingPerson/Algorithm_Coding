import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] board;

    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int answer = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j] && max < dp[j]) {
                    max = dp[j];
                }
                dp[i] = max + 1;
                answer = Math.max(answer, dp[i]);
            }
        }
        System.out.println(answer);
    }
}
