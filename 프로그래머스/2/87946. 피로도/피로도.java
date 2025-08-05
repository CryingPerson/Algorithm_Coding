class Solution {
    static int a = 0;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean[dungeons.length];    
        DFS(k, dungeons, 0);
        
        return a;
    }
    static void DFS(int k , int[][]dungeons, int depth){
        a = Math.max(a, depth);
        for(int i = 0; i < dungeons.length; i++){
            int require = dungeons[i][0];
            int use = dungeons[i][1];
            
            if(k >= require && !visited[i]){
                visited[i] = true;
                DFS(k - use, dungeons, depth+1);
                visited[i] = false;
            }
        }
    }
}