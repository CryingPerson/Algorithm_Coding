class Solution {
    static boolean[][] visited;
    static int maxLen = -1;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        
        visited = new boolean[dungeons.length][dungeons[0].length];
        DFS(k, 0, dungeons);
        return maxLen;
    }
    public static void DFS(int k, int cnt, int[][] dungeons){
        maxLen = Math.max(cnt, maxLen);
        System.out.println(cnt);
        for(int i = 0; i < dungeons.length; i++){
            int require = dungeons[i][0];
            int use = dungeons[i][1];
            
            if(k >= require && !visited[i][0]){
                visited[i][0] = true;
                DFS(k - use, cnt + 1, dungeons);
                visited[i][0] = false;
            }
        }
    }
}