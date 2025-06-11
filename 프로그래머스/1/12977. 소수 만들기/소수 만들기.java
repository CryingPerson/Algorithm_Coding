class Solution {
    static int ans = 0;
    static boolean[] chek;
    public int solution(int[] nums) {
        int answer = 0;
        chek = new boolean[nums.length];
        DFS(nums, 0, 0, 0);

        return ans;
    }
    static void DFS(int[] nums, int L, int sum, int start){
        if(L == 3){
            System.out.println(sum);
            if(isPrime(sum)) ans++;
            return;
        }
        for(int i = start; i < nums.length; i++){
                DFS(nums, L+1, sum + nums[i], i+1);
            }
        }
    static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}