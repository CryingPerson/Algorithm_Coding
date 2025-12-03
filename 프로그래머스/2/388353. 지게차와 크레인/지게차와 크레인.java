import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    static char[][] board;
    static int x,y;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static List<int[]> temp;

    public static int solution(String[] storage, String[] requests) {
        int answer = 0;

        board = new char[storage.length][storage[0].length()];

        x = storage.length;
        y = storage[0].length();
        for(int i = 0; i < storage.length; i++){
            for(int j = 0; j < storage[0].length(); j++){
                board[i][j] = storage[i].charAt(j);
            }
        }

        temp = new ArrayList();
        for(int i = 0; i < requests.length; i++){
            String cmd = requests[i];


            temp.clear();
            if(cmd.length() == 1){
                zige(cmd.charAt(0));
                remove();
            }else{
                crain(cmd.charAt(0));
                remove();
            }
        }

        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(board[i][j] != '1') count++;
            }
        }
        return count;
    }

    static void remove() {
        for (int[] po : temp) {
            board[po[0]][po[1]] = '1';
        }
    }
    static void zige(char c){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(board[i][j] == c && end(i,j)){
                    temp.add(new int[]{i,j});
                }
            }
        }
    }

    static boolean end(int xx, int yy) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{xx,yy});

        boolean[][] visited = new boolean[x][y];
        visited[xx][yy] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = poll[0] + dx[j];
                    int ny = poll[1] + dy[j];

                    if(nx < 0 || ny < 0 || nx >= x || ny >= y) return true;

                    if(board[nx][ny] != '1') continue;
                    if(!visited[nx][ny] && board[nx][ny] == '1'){
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
        }
        return false;
    }
    static boolean poss2(int cx, int cy, char tar){
        for(int i = 0; i < 4; i++){
            int nx = cx + dx[i];
            int ny = cy + dy[i];
            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;

            if(board[nx][ny] == tar && end(cx,cy)){
                temp.add(new int[]{nx,ny});
                return true;
            }
        }
        return false;
    }

    static boolean poss(int cx, int cy){
        for(int i = 0; i < 4; i++){
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y){
                temp.add(new int[]{cx,cy});
                return true;
            }

        }
        return false;
    }
    static void crain(char c){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(board[i][j] == c){
                    temp.add(new int[]{i,j});
                }
            }
        }
    }
}