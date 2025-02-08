class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] dp = new int[n+1];
        dp[1] = 1 % 1000000007;
        if(n > 1 )dp[2] = 2 % 1000000007;
        
        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1000000007;
        }
        return dp[n];
    }
}