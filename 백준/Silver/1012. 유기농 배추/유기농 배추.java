
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static int[] dx = {-1, 0, 1, 0}; // 각 n에 대한 [0 호출 횟수, 1 호출 횟수] 저장
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
                        BFS(board,s,p,x,y);
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    public static void BFS(int[][]board, int x, int y, int mx, int my) {
        Queue<point> queue  = new LinkedList<>();
        queue.add(new point(x,y));
        while (!queue.isEmpty()) {
            point p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if (nx >= 0 && nx < mx && ny >= 0 && ny < my && board[nx][ny] == 1) {
                    queue.add(new point(nx,ny));
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
class point{
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}