import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n, m, k;
    public static ArrayList<ArrayList<Integer>> list;
    public static boolean[] visited;
    public static int[][]board;
    public static int cnt = 0;
    public static int[]dx = {-1,0,1,0};
    public static int[]dy = {0,1,0,-1};
    public static Set<String> st = new HashSet<>();
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
         n = kb.nextInt();
         m = kb.nextInt();
         k = kb.nextInt();
        board = new int[n][m];

        for (int i = 0; i < k; i++) {
            int a = kb.nextInt() -1;
            int b = kb.nextInt() -1;

            board[a][b] = 1;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 1){
                    int ans = BFS(i,j);
                    maxSum = Math.max(maxSum, ans);
                    cnt = 0;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static int BFS(int x, int y) {
        Queue<point> queue = new LinkedList<>();
        board[x][y] = 0;
        cnt = 1;
        queue.add(new point(x,y));
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                point poll = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1){
                        cnt++;
                        queue.add(new point(nx,ny));
                        board[nx][ny] = 0;
                    }
                }
            }
        }
        return cnt;
    }
}
class point{
    int x;
    int y;
    public point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
