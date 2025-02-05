import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int solution = Solution.solution(arr);
        System.out.println(solution);
    }

}
class Solution {
    public static int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            return arr[0] + arr[1]; // 두 계단만 있을 경우 직접 합산
        }
        int[] dp = new int[arr.length];
        int[] staris = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            staris[i] = arr[i];
        }
        dp[0] = arr[0];
        dp[1] = arr[1]+ arr[0];
        dp[2] = Math.max(arr[1]+arr[2], arr[0]+ arr[2]);

        for(int i = 3; i<arr.length; i++){
            dp[i] = Math.max(dp[i-3] + staris[i-1] + staris[i], dp[i-2] + staris[i]);
        }
        return dp[arr.length-1];
    }
}