import java.sql.ClientInfoStatus;
import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    static List<int[]> start;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][m];

        che = new boolean[n][m];
        start = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 0) che[i][j] = true;
                if(board[i][j] == 2) start.add(new int[]{i,j});
            }
        }

        int startX = start.get(0)[0];
        int stratY = start.get(0)[1];

        bfs(startX, stratY);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!che[i][j]){
                    sb.append("-1").append(" ");
                }else sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int inx, int iny) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{inx,iny});


        che[inx][iny] = true;


        board[inx][iny] = 0;

        int count = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int j = 0; j < size; j++) {
                int[] poll = queue.poll();

                int cx = poll[0];
                int cy = poll[1];

                for (int i = 0; i < 4; i++) {
                    int nx = dx[i] + cx;
                    int ny = dy[i] + cy;

                    if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                    if(board[nx][ny] == 0) continue;
                    if(che[nx][ny]) continue;

                    board[nx][ny] = count;
                    queue.add(new int[]{nx,ny});
                    che[nx][ny] = true;
                }
            }
            count++;
        }
    }
}