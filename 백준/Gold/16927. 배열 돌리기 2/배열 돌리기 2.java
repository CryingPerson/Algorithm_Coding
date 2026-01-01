import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] board;
    static int[][] dist;
    static final int INF = 1_000_000;
    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};

    static int min = Integer.MAX_VALUE;
    static boolean[][] visited;
    static List<int[]> list = new ArrayList<>();
    static int[] require;
    static boolean[] robot;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int min = Math.min(n,m);

        board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        rotate(min / 2);

        StringBuilder sb = new StringBuilder();

        for (int[] boa : board) {
            for (int num : boa) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb
        );
    }

    static void rotate(int layer) {
        for (int i = 0; i < layer; i++) {

            int left = i;
            int top = i;

            int right = m - i - 1;
            int down = n - i - 1;

            int i1 = 2 * ((right - left) + (down - top));
            int[] save = new int[i1];

            int idx = 0;

            for (int j = left; j <= right; j++) {
                save[idx++] = board[top][j];
            }
            for (int j = top + 1; j <= down; j++) {
                save[idx++] = board[j][right];
            }
            for (int j = right - 1; j >= left; j--) {
                save[idx++] = board[down][j];
            }

            for (int j = down -1 ; j >= top + 1; j--) {
                save[idx++] = board[j][left];
            }

            int[] put = new int[i1];

            int shpit = k % i1;

            int idx2 = 0;

            for (int j = 0; j < i1; j++) {
                put[idx2++] = save[(j + shpit) %i1];
            }

            int plus = 0;
            for (int j = left; j <= right; j++) {
                board[top][j] = put[plus++];
            }
            for (int j = top + 1; j <= down; j++) {
                 board[j][right] = put[plus++];
            }
            for (int j = right - 1; j >= left; j--) {
                board[down][j] = put[plus++];
            }

            for (int j = down - 1; j >= top + 1; j--) {
                board[j][left] = put[plus++];
            }


        }
    }
}
