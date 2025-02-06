
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : Solution.solution(arr)) {
            System.out.println(x);
        }
    }
}

class Solution {
    public static int[] solution(int[] n) {
        int[] result = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            int[] dp = new int[n[i] + 1];

            // 초기값 설정
            if (n[i] >= 0) dp[0] = 1;
            if (n[i] >= 1) dp[1] = 1;
            if (n[i] >= 2) dp[2] = 2;

            // DP 계산
            for (int j = 3; j <= n[i]; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            result[i] = dp[n[i]];  // n[i]에 해당하는 값 저장
        }
        return result;
    }
}
