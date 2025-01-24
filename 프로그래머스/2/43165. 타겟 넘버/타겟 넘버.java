class Solution {
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        DFS(0,0,numbers,target);
        return cnt;
    }
    
    public void DFS(int L, int sum, int[] numbers, int num){
        if(L == numbers.length){
            if(sum == num) cnt++;
        }else{
            DFS(L+1, sum + numbers[L],numbers, num);
            DFS(L+1,sum - numbers[L],numbers, num); 
        }
    }
}