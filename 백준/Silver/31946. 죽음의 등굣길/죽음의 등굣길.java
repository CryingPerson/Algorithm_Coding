import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, -1, 0 , 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static boolean end = false;
    static boolean[][] visited;
    static int n, m;
    static int[] dis;
    static int[] set;
    static int[] one;
    static long max = Long.MIN_VALUE;
    static int[] exam;
    static int[] disable;
    static boolean ends = false;
    static int[] move = {1, 2};

    static int curColor;
    static int maxLength;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][m];

        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        curColor = board[0][0];

        maxLength = sc.nextInt();

        int bfs = bfs();

        System.out.println(bfs == 1 ? "ALIVE" : "DEAD");
    }

    static int bfs() {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                if(poll[0] == n -1 && poll[1] == m - 1) return 1;

                for (int dx = -maxLength; dx <= maxLength; dx++) {
                    for (int dy = -maxLength; dy <= maxLength; dy++) {
                        if (Math.abs(dx) + Math.abs(dy) > maxLength) continue;

                        int nx = poll[0] + dx;
                        int ny = poll[1] + dy;

                        if (!lange(nx, ny)) continue;
                        if (visited[nx][ny]) continue;
                        if (board[nx][ny] != curColor) continue;

                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }



            }
        }
        return -1;
    }

    static boolean lange(int a, int b) {
        if(a < 0 || b < 0 || a >= n || b >= m) return false;

        return true;
    }
}