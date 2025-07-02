class Solution {
    static int cnt = 0;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        DFS(numbers, target, 0, 0);
        return cnt;
    }
    static void DFS(int[] numbers, int target, int L, int sum){
        if(L == numbers.length){
            if(sum == target) cnt++;
            return;
        }
        DFS(numbers, target, L+1, sum + numbers[L]);
        DFS(numbers, target, L+1, sum - numbers[L]);
    }
}