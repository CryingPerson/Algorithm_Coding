import java.util.*;

public class Main {
    static char[][] grid = new char[10][10];

    static boolean[][] visited;
    static int[][] board;
    static int x, y, R;
    static List<int[]> possible;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt();
        board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int day = 0;
        while (true) {

            visited = new boolean[x][y];
            possible = new LinkedList<>();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if(board[i][j] != 0){
                        check(i, j);
                    }
                }
            }

            disappear();

            int num = 0;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (board[i][j] != 0 && !visited[i][j]) {
                        countCheck(i, j);
                        num++;
                    }
                }
            }
            if(num == 0) break;

            day++;

            if(num > 1){
                System.out.println(day);
                return;
            }
        }
        System.out.println(0);
    }

    static void countCheck(int xx, int yy) {
        visited[xx][yy] = true;

        for (int i = 0; i < 4; i++) {
            int nx = xx + dx[i];
            int ny = yy + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;

            if(!visited[nx][ny] && board[nx][ny] != 0){
                countCheck(nx, ny);
            }
        }
    }

    static void disappear() {
        for (int[] pos : possible) {
            if(board[pos[0]][pos[1]] - pos[2] < 0){
                board[pos[0]][pos[1]] = 0;
            }else board[pos[0]][pos[1]] -= pos[2];
        }
    }

    static void check(int cx, int cy) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;

            if(board[nx][ny] == 0){
                count++;
            }
        }

        possible.add(new int[]{cx,cy, count});
    }
}
