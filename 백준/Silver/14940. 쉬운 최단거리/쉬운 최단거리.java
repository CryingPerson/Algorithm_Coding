import java.util.*;

public class Main {
    static int[][] board;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<point> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        board = new int[n][m];
        dis = new int[n][m];
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int place = sc.nextInt();
                board[i][j] = place;
                if (place == 2) {
                    queue.add(new point(i, j));
                    dis[i][j] = 0;  // 목표지점은 거리가 0
                } else {
                    dis[i][j] = -1;  // 나머지 지점은 초기값 -1
                }
            }
        }

        BFS(n, m);

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    System.out.print(0 + " ");  // 갈 수 없는 땅은 0
                } else {
                    System.out.print(dis[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void BFS(int n, int m) {
        while (!queue.isEmpty()) {
            point poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1 && dis[nx][ny] == -1) {
                    dis[nx][ny] = dis[poll.x][poll.y] + 1;
                    queue.add(new point(nx, ny));
                }
            }
        }
    }
}

class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
