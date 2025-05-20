class Solution {
    static int ans = 0;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        visited = new boolean[dungeons.length];
        for(int i = 0; i < dungeons.length; i++){
            DFS(answer, k, dungeons);
        }
        return ans;
    }
    public static void DFS(int answer, int sum, int[][]dungeons){
        ans = Math.max(answer, ans);
        
        for(int i = 0; i < dungeons.length; i++){
            if(dungeons[i][0] <= sum && !visited[i]){
                visited[i] = true;
                DFS(answer + 1, sum - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
    }
}