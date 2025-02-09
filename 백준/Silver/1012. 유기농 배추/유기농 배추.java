

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int x = sc.nextInt(); int y = sc.nextInt(); int k =sc.nextInt();
            int[][]board = new int[x][y];
            for (int j = 0; j < k; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                board[a][b] = 1;
            }

            for (int s = 0; s < x; s++) {
                for (int p = 0; p < y; p++) {
                    if(board[s][p] == 1) {
                        cnt++;
                        board[s][p] = 0;
                        DFS(s,p,board,x,y);
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void DFS(int n, int p, int[][] board, int mx, int my) {
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + n;
            int ny = dy[i] + p;

            if (nx >= 0 && nx < mx && ny >= 0 && ny < my && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx,ny,board,mx,my);
            }
        }
    }
}
