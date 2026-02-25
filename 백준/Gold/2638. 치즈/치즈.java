import java.util.*;

public class Main {
    static int n, m;
    static boolean[] isBroken = new boolean[10];
    static int minTotalPress = Integer.MIN_VALUE;

    static int[][] board;
    static List<int[]> cheeze;
    static List<int[]> store;
    static List<List<Integer>> list;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int day = 0;
        while (true) {

            cheeze = new ArrayList<>();
            store = new ArrayList<>();
            deploy(0, 0);

            if(store.size() == 0){
                break;
            }

            for (int[] xx : store) {
                board[xx[0]][xx[1]] = 0;
            }
            day++;

        }

        System.out.println(day);
    }

    static void deploy(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{x, y});

        boolean[][] visited = new boolean[n][m];
        int[][] possble = new int[n][m];
        visited[x][y] = true;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >=m)continue;
                if(visited[nx][ny]) continue;

                if(board[nx][ny] == 1){
                    possble[nx][ny]++;
                }else {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx,ny});
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (possble[i][j] >= 2) {
                    store.add(new int[]{i,j});
                }
            }
        }
    }
}