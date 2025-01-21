class Solution {
    public long solution(int n) {
        long answer = 0;
        long[]dy = new long[n+1];
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        dy[1] = 1 % 1234567;
        dy[2] = 2 % 1234567;

        for(int i = 3; i<=n; i++){
            dy[i]  = dy[i-2] % 1234567 + dy[i-1] % 1234567;
        }
        return dy[n] % 1234567;
    }
}