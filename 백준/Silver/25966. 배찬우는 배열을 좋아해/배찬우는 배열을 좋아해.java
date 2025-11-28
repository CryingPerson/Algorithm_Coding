import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] use;
    static int[][] board;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long max = Integer.MIN_VALUE;
    static int k;
    static List<int[]> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt(); int query = sc.nextInt();

        board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int t = 0; t < query; t++) {
            int num = sc.nextInt();
            if (num == 0) {
                int i = sc.nextInt() ; int j = sc.nextInt(); int k = sc.nextInt();
                board[i][j] = k;
            }else{
                int i = sc.nextInt() ; int j = sc.nextInt();

                int[] temp = board[i];
                board[i] = board[j];
                board[j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] x : board) {
            for (int xx : x) {
                sb.append(xx).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}

