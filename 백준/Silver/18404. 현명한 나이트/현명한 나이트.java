import java.util.*;

public class Main {

    static int[][] board;
    static  int[] dx = {-2,-2,-1,-1, 1, 1, 2, 2};
    static  int[] dy = {-1, 1,-2, 2,-2, 2,-1, 1};
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

    static boolean[] pass;
    static List<int[]> list = new ArrayList<>();

    static int sx, sy;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][n];

         sx = sc.nextInt() - 1;  sy = sc.nextInt() - 1;
        board[sx][sy] = 1;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1; int y = sc.nextInt() - 1;

            list.add(new int[]{x,y}) ;board[x][y] = 2;
        }

        String bfs = bfs();

        System.out.println(bfs);
    }

    static String bfs() {
        int[][] dist = new int[n][n];

        for(int i = 0; i < n; i++) Arrays.fill(dist[i], -1);

        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{sx,sy});
        dist[sx][sy] = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();

                for (int j = 0; j < 8; j++) {
                    int nx = dx[j] + cur[0];
                    int ny = dy[j] + cur[1];

                    if(nx < 0 || ny < 0 || nx >= n || ny >=n) continue;
                    if(dist[nx][ny] != -1) continue;

                    queue.add(new int[]{nx,ny});
                    dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] curs : list) {
            sb.append(dist[curs[0]][curs[1]]).append(" ");
        }
        return sb.toString();
    }
}