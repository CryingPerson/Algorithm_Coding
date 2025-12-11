import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;

    static List<int[]> start;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        dfs(0,1, 0);
        System.out.println(Size);
    }

    static void dfs(int x, int y, int dir) {
        if (x == n - 1 && y == n - 1) {
            Size++;
            return;
        }

        if (dir == 0) {
            if(y + 1 < n && board[x][y + 1] == 0){
                dfs(x, y + 1, 0);
            }
            if(x + 1 < n && y + 1 < n && board[x + 1][y + 1] == 0 && board[x + 1][y] == 0 && board[x][y + 1] == 0){
                dfs(x + 1, y + 1, 2);
            }
        } else if (dir == 1) {
            if(x + 1 < n && board[x + 1][y] == 0){
                dfs(x + 1, y, 1);
            }
            if(x + 1 < n && y + 1 < n && board[x + 1][y + 1] == 0 && board[x + 1][y] == 0 && board[x][y + 1] == 0){
                dfs(x + 1, y + 1, 2);
            }
        } else if (dir == 2) {
            if(y + 1 < n && board[x][y + 1] == 0){
                dfs(x, y + 1, 0);
            }
            if(x + 1 < n && board[x + 1][y] == 0){
                dfs(x + 1, y, 1);
            }
            if(x + 1 < n && y + 1 < n && board[x + 1][y + 1] == 0 && board[x + 1][y] == 0 && board[x][y + 1] == 0){
                dfs(x + 1, y + 1, 2);
            }
        }
    }
}