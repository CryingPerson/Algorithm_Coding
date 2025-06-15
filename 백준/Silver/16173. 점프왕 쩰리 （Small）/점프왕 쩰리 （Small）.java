import java.util.*;

public class Main {
    static int[] dx = {0, 1}; // 오른쪽, 아래
    static int[] dy = {1, 0};
    static int[][] board;
    static boolean[][] checked;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        board = new int[N + 1][N + 1];
        checked = new boolean[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        BFS(1, 1, N, N); // 목표 좌표를 N으로 설정
    }

    static void BFS(int x, int y, int findX, int findY) {
        Queue<point> queue = new LinkedList<>();
        queue.add(new point(x, y));

        while (!queue.isEmpty()) {
            point poll = queue.poll();

            if (poll.x == findX && poll.y == findY) {
                System.out.println("HaruHaru");
                return;
            }
            for (int i = 0; i < 2; i++) {
                int nx = poll.x;
                int ny = poll.y;

                if (nx >= 1 && nx < board.length && ny >= 1 && ny < board.length) {
                    nx = nx + board[nx][ny] * dx[i];
                }
                if (nx >= 1 && nx < board.length && ny >= 1 && ny < board.length) {
                    ny = ny + board[nx][ny] * dy[i];
                }

                if (nx >= 1 && nx < board.length && ny >= 1 && ny < board.length && !checked[nx][ny]
                ) {
                    checked[nx][ny] = true;
                    queue.add(new point(nx, ny));
                }
            }
        }

        System.out.println("Hing");
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
