import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int R, C;
    static int[] P;
    static int[] S;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dir;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static boolean game;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt(); C = sc.nextInt();

        board = new int[R][C];

        sc.nextLine();
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                char c = line.charAt(j);

                if(c == '0') board[i][j] = 0;
                else board[i][j] = 1;
            }
        }

        visited = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(!visited[i][j] &&  i == 0 && board[i][j] == 0){
                    dfs(i, j);
                }
            }
        }
        if(game){
            System.out.println("YES");
        }else System.out.println("NO");
    }

    static void dfs(int x, int y) {
        if(game) return;
        visited[x][y] = true;
        if(x == R - 1){
            game = true;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if(visited[nx][ny]) continue;
            if(board[nx][ny] == 1) continue;

            visited[nx][ny] = true;
            dfs(nx,ny);
        }
    }
}