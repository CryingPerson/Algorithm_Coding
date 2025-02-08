class Solution {
    static int[] arr;
    static int ans;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        ans = 0;
        arr = new int[dungeons.length];
        DFS(k, dungeons, answer);
        return ans;
    }
    public static void DFS(int k, int[][]dungeons, int answer){
        
        ans = Math.max(ans, answer);
            for(int i = 0; i<dungeons.length; i++){
                if(arr[i] == 0 && k >= dungeons[i][0]){
                    arr[i] = 1;
            
                    DFS(k - dungeons[i][1], dungeons, answer+1);
                    arr[i] = 0;
                }
            }
      }
}