import java.util.*;

public class Main {
    static List<List<Integer>> list = new ArrayList<>();
    static int K;

    static int l, n, m;
    static int[] hox = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] hoy = {-2, -1, 1, 2, 2, 1, -1, -2};

    static int[] upDown = {-1, 1};
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][][] board;
    static boolean[][] visited;

    static int sl, sx, sy, el, ex, ey;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            l = sc.nextInt();
            n = sc.nextInt();
            m = sc.nextInt();

            if (l == 0 && n == 0 && m == 0) break;
            board = new char[l][n][m];

            sc.nextLine();
            for (int i = 0; i < l; i++) {

                for (int j = 0; j < n; j++) {
                    String s = sc.nextLine();
                    for (int k = 0; k < m; k++) {
                        board[i][j][k] = s.charAt(k);
                        if (board[i][j][k] == 'S') {
                            sl = i;
                            sx = j;
                            sy = k;
                        }
                        if (board[i][j][k] == 'E') {
                            el = i;
                            ex = j;
                            ey = k;
                        }
                    }
                }
                sc.nextLine();
            }
            int bfs = bfs();
            String a1 = "Escaped in ";
            String a2 = a1 + bfs;
            String a3 = a2 + " minute(s).";

            if(bfs == -1){
                System.out.println("Trapped!");
            }else System.out.println(a3);
        }
    }

    static int bfs() {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{sl, sx, sy});

        boolean[][][] visited = new boolean[l][n][m];
        int L = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int a = 0; a < size; a++) {
                int[] poll = queue.poll();

                int cl = poll[0];
                int cx = poll[1];
                int cy = poll[2];

                if(cl == el && cx == ex && cy == ey) return L;

                for (int i = 0; i < 4; i++) {

                    int nx = cx + dx[i];
                    int ny = cy + dy[i];

                    if (nx >= 0 && ny >= 0 && nx < n && ny < m){
                        if(!visited[cl][nx][ny] && board[cl][nx][ny] != '#'){
                            visited[cl][nx][ny] = true;
                            queue.add(new int[]{cl, nx, ny});
                        }
                    }
                }
                for (int i = 0; i < 2; i++) {
                    int nx = cl + upDown[i];

                    if (nx >= 0 && nx < l){
                        if(!visited[nx][cx][cy] && board[nx][cx][cy] != '#'){

                            visited[nx][cx][cy] = true;
                            queue.add(new int[]{nx, cx, cy});
                        }
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
