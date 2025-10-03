import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static int L;
    static int K;
    static int n;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int count;
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt(); int k = sc.nextInt();

        board = new int[n][n];
        visited = new boolean[n][n];

        List<point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int nn = sc.nextInt();
                board[i][j] = nn;
                if (nn != 0 && !visited[i][j]) {
                    list.add(new point(i,j,nn));
                }
            }
        }

        int s = sc.nextInt(); int xx = sc.nextInt() - 1; int yy = sc.nextInt() - 1;

        list.sort(((o1, o2) -> {
            return o1.num - o2.num;
        }));

        while (s > 0) {
            for (point po : list) {
                DFS(po.x, po.y, po.num);
            }
            s--;

            list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] != 0 && !visited[i][j]) {
                        list.add(new point(i,j,board[i][j]));
                    }
                }
            }
            list.sort(((o1, o2) -> {
                return o1.num - o2.num;
            }));
        }
        System.out.println(board[xx][yy]);
    }

    static void DFS(int x, int y, int virous) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

            if(board[nx][ny] != 0) continue;

            board[nx][ny] = virous;
        }
    }
}
class point{
    int x;
    int y;
    int num;

    public point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }
}
