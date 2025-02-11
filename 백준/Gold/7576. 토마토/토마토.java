
import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static Queue<point> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        queue = new LinkedList<>();
        board = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int bfs = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j] == 1) {
                     queue.add(new point(i,j));
                }
            }
        }
         bfs = BFS(m,n);
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(board[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(bfs-1);
    }
    public static int BFS(int n, int m) {

        int L = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                point poll = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];

                    if(nx >= 1 && nx <=n && ny >= 1 && ny <= m && board[nx][ny] == 0){
                        board[nx][ny] = 1;
                        queue.add(new point(nx,ny));
                    }
                }
            }
            L++;
        }
        return L;
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
