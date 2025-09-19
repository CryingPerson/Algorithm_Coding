import java.util.*;
class Solution {
    static int[] dx = {-1 , 0, 1 ,0};
    static int[] dy = {0 ,1,0,-1};
    static boolean[][] visited;
    public int solution(int[][] maps) {
        int answer = 0;
        
        visited = new boolean[maps.length][maps[0].length];
        answer = BFS(maps, 0, 0);
        return answer;
    }
    static int BFS(int[][] board, int x, int y){
        Queue<int[]> q = new LinkedList();
        
        visited[x][y] = true;
        q.add(new int[]{x,y});
        int L = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] pos = q.poll();
                
                if(pos[0] == board.length - 1 && pos[1] == board[0].length - 1){
                    return L;
                }
                for(int k = 0; k < 4; k++){
                    int nx = pos[0] + dx[k];
                    int ny = pos[1] + dy[k];
                    
                    if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) continue;
                    if(board[nx][ny] == 0) continue;
                    
                    if(!visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            L++;
        }
        return -1;
        
    }
}