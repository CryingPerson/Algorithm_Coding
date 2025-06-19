class Solution {
    static int max = -1;
    static boolean[][] visited;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean [dungeons.length][dungeons[0].length];
        
        DFS(k, dungeons, 0);
        return max;
    }
    static void DFS(int k, int[][] answer, int depth){
        max = Math.max(max, depth);
        for(int i = 0; i < answer.length; i++){
            int cur = answer[i][0];
            int use = answer[i][1];
            if(!visited[i][0] && k >= cur){
                visited[i][0] = true;
                DFS(k - use, answer ,depth + 1);
                visited[i][0] = false;
            }
        }
    }
}