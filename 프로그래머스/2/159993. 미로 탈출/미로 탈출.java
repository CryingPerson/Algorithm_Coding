import java.util.*;
class Solution {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(String[] maps) {
        int answer = 0;
        
        int a = maps.length;
        int b = maps[0].length();
        int laX = 0;
        int laY = 0;
        int startX = 0;
        int startY = 0;
        int lastX = 0;
        int lastY = 0;
        for(int i = 0; i < maps.length; i++){
            char[] css = maps[i].toCharArray();
            for(int j = 0; j < maps[i].length(); j++){
                if(css[j] == 'L'){
                    laX = i;
                    laY = j;
                }else if(css[j] == 'E'){
                    lastX = i;
                    lastY = j;
                }else if(css[j] == 'S'){
                    startX = i;
                    startY = j;
                }
            }
        }
        
        int aa = BFS(a, b, startX, startY, laX, laY, maps);
        if(aa == -1) return -1;
        int bb = BFS(a, b, laX, laY, lastX, lastY, maps);
        if(bb == -1) return -1;
        return aa + bb;
    }
    public static int BFS(int a, int b, int x, int y, int findX, int findY, String[]maps){
        Queue<point> qu = new LinkedList();
        qu.add(new point(x,y));
        boolean[][] visited = new boolean[a][b];
        int L = 0;
        while(!qu.isEmpty()){
            int se = qu.size();
            for(int i = 0; i < se; i++){
                point p = qu.poll();
                if(p.x == findX && p.y == findY){
                  return L;  
                } 
                
                for(int j = 0; j < 4; j++){
                    int nx = dx[j] + p.x;
                    int ny = dy[j] + p.y;
                    
                    if (nx >= 0 && nx < a && ny >= 0 && ny < b) {
                        if (!visited[nx][ny] &&
                            (maps[nx].charAt(ny) == 'O' ||
                             maps[nx].charAt(ny) == 'L' ||
                             maps[nx].charAt(ny) == 'E' ||
                            maps[nx].charAt(ny) == 'S')) {
                            visited[nx][ny] = true;
                            qu.add(new point(nx, ny));
                        }
                    }
                }
            }
            L++;
        }
        return -1;
        
    }
}
class point{
    int x;
    int y;
    public point(int x, int y){
        this.x = x;
        this.y = y;
    }
}