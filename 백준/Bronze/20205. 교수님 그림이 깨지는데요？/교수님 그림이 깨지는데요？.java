import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] visited;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long min = Integer.MAX_VALUE;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x=  sc.nextInt(); int kk = sc.nextInt();
        int[][] board = new int[x * kk][x * kk];

        int plx = kk;
        int ply = kk;
        int chx = 0;
        int chy = 0;
        for (int i = 0; i < x; i ++) {
            chy = 0;
            for (int j = 0; j < x; j ++) {
                int num = sc.nextInt();
                for (int k = chx; k < kk + chx; k++) {
                    for (int z = chy; z < chy + kk; z++) {
                        board[k][z] = num;
                    }
                }
                chy += kk;
            }
            chx += kk;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
