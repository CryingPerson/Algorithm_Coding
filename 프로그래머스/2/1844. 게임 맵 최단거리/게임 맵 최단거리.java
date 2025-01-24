import java.util.*;
class Solution {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int[][] maps) {
        int answer = 1;
        int n = maps.length;    // 행 크기
        int m = maps[0].length;
        Queue<Point> q = new LinkedList();
        q.add(new Point(0,0));
        maps[0][0] = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int a = 0; a<size; a++){
                 Point pos = q.poll();
                if(pos.x == n-1 && pos.y == m-1) return answer;
                for(int i =0; i<4; i++){
                    int nx = pos.x + dx[i];
                    int ny = pos.y + dy[i];
                    if(nx >= 0 && nx < n && ny >= 0 && ny <m && maps[nx][ny] == 1){
                        maps[nx][ny] = 0;
                        q.add(new Point(nx, ny));
                    }
                }
           
            }
                answer++;
        }
        boolean flag = true;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(maps[i][j] == 1){
                    flag = false;
                }
            }
        }
        if(!flag) return -1;
        return answer;
    }
}
class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}