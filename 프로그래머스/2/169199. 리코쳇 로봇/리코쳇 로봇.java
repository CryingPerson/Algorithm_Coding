import java.util.*;
class Solution {
    static int[] dx = {-1, 0 ,1 , 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;
    static boolean[][] visited;
    public int solution(String[] board) {
        int answer = 0;
        int x = board.length;
        int y = board[0].length();
        game = new char[x][y];
        visited = new boolean[x][y];
        int robotX = -1;
        int robotY = -1;
        for(int i = 0; i < x; i++){
            String line = board[i];
            for(int j = 0; j < y; j++){
                char c = line.charAt(j);
                game[i][j] = c;
                if(c == 'R'){
                    robotX = i;
                    robotY = j;
                }
                if(c =='D'){
                    dis.add(new int[]{i,j});
                }
                if(c == 'G'){
                    goalX = i;
                    goalY = j;
                }
            }
        }
        answer = BFS(robotX, robotY);
        
        return answer;
    }
    static int BFS(int x, int y){
        Queue<int[]> q = new LinkedList();
        visited[x][y] = true;
        q.add(new int[]{x,y});
        
        int L = 0;
        int lll =0;
        while(!q.isEmpty()){
            if(L > game.length * game[0].length) return -1;
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] pos = q.poll();
                if(pos[0] == goalX && pos[1] == goalY) return L;
                for(int k = 0; k < 4; k++){
                    int xx = pos[0];
                    int yy = pos[1];
                        while(true){
                        int nx = xx + dx[k];
                        int ny = yy + dy[k];
                    
                        if(nx < 0 || ny < 0 || nx >= game.length || ny >= game[0].length || game[nx][ny] == 'D'){
                            if(!visited[xx][yy]){
                                visited[xx][yy] = true;
                                q.add(new int[]{xx,yy});
                            }
                            dir = (dir + 1) % 4;
                            break;
                        }
                        xx = nx;
                        yy = ny;
                    }
                }
            }
            L++;
        }
        return -1;
    }
}