import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
     static char[][] board;
     static int max = 0;
     static List<int[]> list = new ArrayList<>();
     static List<int[]> viruous = new ArrayList<>();
     static int n, m;
     static int mins = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = sc.next().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'L') list.add(new int[]{i,j});
            }
        }

        for (int[] ss : list) {
            int i = bfs2(ss);
            max = Math.max(max, i);
        }

        System.out.println(max);
    }

    static int bfs2(int[] ll) {
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{ll[0], ll[1]});
        visited[ll[0]][ll[1]] = true;

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();
                int cx = poll[0];
                int cy = poll[1];

                for (int j = 0; j < 4; j++) {
                    int nx = cx + dx[j];
                    int ny = cy + dy[j];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    if(!visited[nx][ny] && board[nx][ny] == 'L'){
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx,ny});
                    }
                }
            }
            L++;
        }
        return L - 1;
    }
}
