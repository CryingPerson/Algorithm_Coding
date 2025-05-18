class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 0;
        int lt = 0;
        
        int[]arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        
        for(int i = 0 ; i < n; i++){
            sum += arr[i];
            if(sum == n) answer++;
            while(sum >= n){
                sum -= arr[lt];
                lt++;
                if(sum == n)answer++;
            }
        }
        return answer;
    }
}