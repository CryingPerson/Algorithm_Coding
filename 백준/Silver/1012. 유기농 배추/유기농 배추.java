import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n, x, y, k;
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

        for (int i = 0; i < n; i++) {
            x = kb.nextInt();
            y = kb.nextInt();
            k = kb.nextInt();
            board = new int[x][y];

            for (int j = 0; j < k; j++) {
                int row = kb.nextInt();
                int col = kb.nextInt();

                board[row][col] = 1;
            }
            int answer = 0;
            for (int a = 0; a < x; a++) {
                for (int b = 0; b < y; b++) {
                    if(board[a][b] == 1){
                        answer++;
                        board[a][b] = 0;
                        DFS(a,b);
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void DFS(int xx, int yy) {
        for (int i = 0; i < 4; i++) {
            int nx = xx + dx[i];
            int ny = yy + dy[i];

            if (nx >= 0 && nx < x && ny >= 0 && ny < y && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
}
