import java.util.*;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Set<String> set = new HashSet<>();
    static StringBuffer sb = new StringBuffer();
    static int[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;
    static int total = 0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    int num = sc.nextInt();
                    sum += num;
                }
                board[i][j] = sum;
            }
        }
        int range = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] / 3 >= range) {
                    board[i][j] = 255;
                }else{
                    board[i][j] = 0;
                }
            }
        }

        visited = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 255){
                    if(!visited[i][j]){
                        cnt++;
                        dfs(i,j);
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >=m) continue;
            if(!visited[nx][ny] && board[nx][ny] == 255){
                visited[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }
}