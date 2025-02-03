import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0; // 1은 연산 필요 없음

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 1 빼기 연산
            
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누기
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누기
        }
        
        System.out.println(dp[n]); // 최소 연산 횟수 출력
    }
}