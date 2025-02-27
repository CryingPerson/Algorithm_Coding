import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int solution = Solution.solution(n);
        System.out.println(solution);
    }

}
class Solution {
    public static int solution(int arr) {
        if(arr == 1) return 0;
        if(arr == 2) return 1;

        int[] dp = new int[arr+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 0;
        dp[2] = 1;

        for(int i =3; i<=arr; i++){
            if(i % 2 == 0) dp[i] = dp[i/2] + 1;
            if(i % 3 == 0) dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            dp[i] = Math.min(dp[i-1] + 1, dp[i]);
        }

        return dp[arr];
    }
}