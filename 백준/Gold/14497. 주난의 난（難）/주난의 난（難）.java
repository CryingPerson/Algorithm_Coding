import java.util.*;

public class Main {
    static int[] dx = {-1 ,0 ,1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = Integer.MIN_VALUE;
    static boolean[][] visited;

    static int[][] dist;
    static char[][] board;
    static int n,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        board = new char[n][m];

        int start = sc.nextInt(); int start2 = sc.nextInt();
        int find1 = sc.nextInt(); int find2 = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < m; j++) {
                board[i] = line.toCharArray();
            }
        }

        bfs(start - 1, start2 - 1);

        System.out.println(dist[find1 - 1][find2 - 1]);
    }

    static void bfs(int x, int y) {
        dist[x][y] = 0;

        Deque<int[]> deque = new LinkedList<>();
        deque.add(new int[]{x,y});

        while (!deque.isEmpty()) {

            int[] cur = deque.poll();

            int cx = cur[0];
            int cy = cur[1];


            for (int j = 0; j < 4; j++) {

                int nx = cx + dx[j];
                int ny = cy + dy[j];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                int nextCost = (board[nx][ny]  == '#' || board[nx][ny] - '0' == 1) ? 1 : 0;

                if (dist[nx][ny] > dist[cx][cy] + nextCost){
                    dist[nx][ny] = dist[cx][cy] + nextCost;

                    if (nextCost == 1) {
                        deque.addLast(new int[]{nx, ny});
                    }else{
                        deque.addFirst(new int[]{nx,ny});
                    }

                }
            }
        }
    }
}