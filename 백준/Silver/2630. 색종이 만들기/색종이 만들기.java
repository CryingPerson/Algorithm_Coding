import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int sum = 0;
    public static int white = 0;
    public static int blue = 0;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();
        board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        DFS(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void DFS(int x, int y, int Len) {


        if (check(x, y, Len)) {
            if (board[x][y] == 0) white++;
            else blue++;
            return;
        }
        DFS(x, y + Len / 2, Len / 2); // 1사부면
        DFS(x, y, Len/2);       //2
        DFS(x + Len/2, y, Len/2);
        DFS(x+Len/2, y+Len/2, Len/2);

    }

    public static boolean check(int x, int y, int Len) {
        int num = board[x][y];

        for (int i = x; i < x + Len; i++) {
            for (int j = y; j < y + Len; j++) {
                if (num != board[i][j]) return false;
            }
        }
        return true;
    }
}