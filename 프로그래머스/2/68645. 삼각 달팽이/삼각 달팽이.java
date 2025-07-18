import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};

        int[] dx = {1, 0, -1};
        int[] dy = {0, 1, -1};
        int sum = calcie(n);

        int x = -1; int y= 0; int dir = 0; int num = 1;
        int[][] board = new int[n][n];

        for(int i = 0; i < board.length; i++){
            for(int j = i; j < board.length; j++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                    board[nx][ny] = num++;
                }
                x = nx;
                y = ny;
            }
            dir = (dir + 1) % 3;
        }
        
        answer = new int[sum];

        int sxx = 0;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != 0){
                    answer[sxx] = board[i][j];
                    sxx++;
                }
            }
        }
        return answer;
    }
    static int calcie(int n){
        int sum = 0;

        for(int i = n; i >=1; i--){
            sum += i;
        }

        return sum;
    }
}
