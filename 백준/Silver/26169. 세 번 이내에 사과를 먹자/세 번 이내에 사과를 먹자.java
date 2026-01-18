import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean end = false;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new int[5][5];
        visited = new boolean[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int startX = sc.nextInt(); int startY = sc.nextInt();

        dfs(0, 0,startX, startY);

        if(end){
            System.out.println(1);
        }else System.out.println(0);
    }

    static void dfs(int depth, int total, int X, int Y) {
        if(end) return;
        if(board[X][Y] == 1){
            total++;
        }
        if(depth > 3){
            return;
        }

        if (depth == 3) {
            if(total >= 2){
                end = true;
                return;
            }
        }

        for (int i = 0; i < 4; i++) {
            int nx = X + dx[i];
            int ny = Y + dy[i];

            if(nx < 0 || ny <0 || nx >= 5 || ny >= 5) continue;

            if(board[nx][ny] == -1) continue;
            if(visited[nx][ny]) continue;
            visited[nx][ny] = true;
            int temp = board[X][Y];
            board[X][Y] = -1;


            dfs(depth + 1, total, nx,ny);

            board[X][Y] = temp;
            visited[nx][ny] = false;
        }
    }
}
