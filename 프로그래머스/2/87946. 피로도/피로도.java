class Solution {
    static int max = Integer.MIN_VALUE;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        
        visited = new boolean[dungeons.length];
        DFS(0, k, dungeons);
        return max;
    }
    static void DFS(int depth, int curHp, int[][] dungeons){
        max = Math.max(max, depth);
        for(int i = 0; i < dungeons.length; i++){
            int require = dungeons[i][0];
            int use = dungeons[i][1];
            
            if(curHp >= require && !visited[i]){
                visited[i] = true;
                DFS(depth + 1, curHp - use, dungeons); 
                visited[i] = false;
            }
        }
    }
}