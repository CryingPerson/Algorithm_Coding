import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); int C = sc.nextInt();

        board = new char[R][C];

        sc.nextLine();

        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == '#') {
                    DFS(i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

    static void DFS(int x, int y) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        board[x][y] = '*';
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) continue;

            if (board[nx][ny] == '#') {
                DFS(nx,ny);
            }
        }
    }
}
