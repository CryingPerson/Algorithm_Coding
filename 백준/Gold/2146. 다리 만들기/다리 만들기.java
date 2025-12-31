import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] board;
    static int[][] dist;
    static final int INF = 1_000_000;
    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};

    static int min = Integer.MAX_VALUE;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int pos = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    bfs(i, j, pos);
                    pos++;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 0) {
                    int i1 = bfs2(i, j, board[i][j]);
                    if(i1 == -1) continue;
                    min = Math.min(min, i1);
                }
            }
        }
        System.out.println(min - 1);
    }

    static int bfs2(int x, int y, int first) {
        Queue<int[]> queue = new LinkedList<>();

        visited = new boolean[n][n];
        queue.add(new int[]{x, y});

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                int cx = poll[0];
                int cy = poll[1];

                if(board[cx][cy] != 0 && board[cx][cy] != first) return L;

                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                    if(visited[nx][ny]) continue;
                    if(board[nx][ny] == first) continue;

                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }
            L++;
        }
        return -1;
    }

    static void bfs(int st, int sy, int push) {
        visited[st][sy] = true;
        board[st][sy] = push;
        for (int i = 0; i < 4; i++) {
            int nx = st + dx[i];
            int ny = sy + dy[i];

            if(nx < 0 || ny < 0 || nx >=n || ny >=n) continue;
            if(board[nx][ny] == 0) continue;
            if(visited[nx][ny]) continue;

            bfs(nx, ny, push);
        }
    }
}
