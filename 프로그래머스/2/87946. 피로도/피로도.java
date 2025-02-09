class Solution {
    static int ans = 0;
    static int[] ch;
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        ch = new int[dungeons.length];
        for(int i = 0; i<dungeons.length; i++){
            DFS(k,0,dungeons,answer);
        }
        
        return ans;
    }
    public static void DFS(int n ,int L, int[][] dungeons, int answer){
        ans = Math.max(ans, answer);
        
    
            for(int i = 0; i<dungeons.length; i++){
                if(dungeons[i][0] <= n && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(n - dungeons[i][1], L+1, dungeons, answer+1);
                    ch[i] = 0;
                }
    
        }
    }
}