import java.util.*;

class Main {
    static int[][] board;
    static boolean[][] visited;
    static int n;
    static int c = 0;
    static List<int[]> point;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];

        int sx = 0,sy = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();

                if (board[i][j] == 9) {
                    sx = i;
                    sy = j;
                }
            }
        }

        int size = 2; int time = 0; int eat = 0;
        while (true) {
            fish fi = bfs(sx,sy,size);
            board[sx][sy] = 0;
            if(fi == null) break;

            sx = fi.x;
            sy = fi.y;

            time += fi.dist;
            eat++;

            if (eat == size) {
                size++;
                eat = 0;
            }
        }
        System.out.println(time);
    }

    static fish bfs(int x, int y, int size) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        visited[x][y] = true;
        queue.add(new int[]{x,y, 0});


        List<fish> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int cx = cur[0];
            int cy = cur[1];
            int cDis = cur[2];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if(visited[nx][ny]) continue;
                if(board[nx][ny] > size) continue;

                visited[nx][ny] = true;
                if(board[nx][ny] != 0 && board[nx][ny] < size) list.add(new fish(nx,ny, cDis + 1));
                queue.add(new int[]{nx,ny, cDis + 1});

            }
        }
        list.sort(((o1, o2) -> {
            if (o1.dist == o2.dist) {
                if (o1.x == o2.x) {
                    return o1.y - o2.y;
                }
                return o1.x - o2.x;
            }
            return o1.dist - o2.dist;
        }));

        if(list.size() != 0) return list.get(0);
        return null;
    }
}
class fish{
    int x;
    int y;
    int dist;

    public fish(int x, int y, int dist) {
        this.x = x; this.y = y; this.dist = dist;
    }
}