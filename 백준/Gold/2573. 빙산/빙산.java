import java.awt.*;
import java.util.*;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int[]ch;
    public static int wall = 0;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static int N;
    public static int n,m;
    public static boolean[][] visited;
    public static boolean[][] check;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        System.out.println(simul());
    }

    public static int simul(){
        int years = 0;

        while (true) {
            int count = DFS();

            if(count >= 2) return years;
            if(count == 0) return 0;

            years++;
            disappear();

        }
    }
    public static void disappear(){
        int[][] temp = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] > 0){
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0){
                            cnt++;
                        }
                    }
                    temp[i][j] = cnt;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] -= temp[i][j];
                if(board[i][j] < 0) board[i][j] = 0; // 0보다 작지 않도록 처리
            }
        }
    }

    public static int DFS() {
        int cnt = 0;
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] > 0 && !visited[i][j]) {
                    cnt++;
                    dfs(i,j);
                }
            }
        }
        return cnt;
    }
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && board[nx][ny] > 0) {
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}
