import java.util.*;
class Solution {
    static int[] dx = {-1, 1, 1, -1};
    static int[] dy = {1, 1, -1, -1};
    static int[] ax = {-1, -2, 0, 0, 1, 2, 0 ,0};
    static int[] ay = {0,0, 1, 2, 0, 0, -1, -2};
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for(int i = 0; i < places.length; i++){
            char[][] ch = new char[5][5];
            for(int j = 0; j < places[0].length; j++){
                for(int k = 0; k < 5; k++){
                    ch[j][k] = places[i][j].charAt(k);
                }
            }
            if(check(ch)){
                answer[i] = 1;
            }else{
                answer[i] = 0;
            }
            
        }
        return answer;
    }
    static boolean check(char[][] ch){
        List<int[]> list = new ArrayList();
        
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < ch.length; j++){
                if(ch[i][j] == 'P'){
                    list.add(new int[]{i,j});
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            int[] point = list.get(i);
            
            int x = point[0];
            int y = point[1];
            
            if(!visit(x,y, ch)){
                return false;
            }
        }
        return true;
    }
    static boolean visit(int x, int y, char[][] ch){
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx < 0 || nx >= ch.length || ny < 0 || ny >= ch.length) continue;
            
            if(ch[nx][ny] == 'P'){
                if(x > nx){
                    if(ch[x-1][y] == 'O') return false;
                    if(ch[nx+1][y] == 'O') return false;
                }else{
                    if(ch[x+1][y] == 'O') return false;
                    if(ch[nx-1][y] == 'O') return false;
                }
            }
        }
        for(int i = 0; i < 8; i++){
            int nx = x + ax[i];
            int ny = y + ay[i];
            
            if(nx < 0 || nx >= ch.length || ny < 0 || ny >= ch.length) continue;
            
            if(ch[nx][ny] == 'P'){
                int dist = Math.abs(x - nx) + Math.abs(y - ny);
                if(dist == 1) return false;
                if(dist == 2){
                if(x == nx){ // 가로로 두 칸
                    int my = (y + ny) / 2;
                    if(ch[x][my] == 'O') return false;
                } else if(y == ny){ // 세로로 두 칸
                    int mx = (x + nx) / 2;
                    if(ch[mx][y] == 'O') return false;
                }
            }
        }
    }
        return true;
    }
}