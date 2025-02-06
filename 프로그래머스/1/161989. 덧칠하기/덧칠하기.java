class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        boolean[] sec = new boolean[n+1];
        for(int x : section) sec[x] = true;
        
        int left = 1;
        int right = n;
        
        while(left <= n){
            if(sec[left]){
                for(int i = left; i<left+m && i <= n; i++){
                    sec[i] = false;
                }
                answer++;
                left += m;
            }else{
                left++;
            }
            for(int i = 1; i<=n; i++){
                if(sec[i]){
                    left = i;
                    answer++;
                }else{
                    break;
                }
            }
        }
        
        return answer;
    }
}