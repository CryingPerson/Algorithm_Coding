import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static boolean[][] board;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new boolean[501][501];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt(); int y1  =sc.nextInt(); int x2 = sc.nextInt(); int y2 = sc.nextInt();

            for (int a = x1; a < x2; a++) {
                for (int b = y1; b < y2; b++) {
                    board[a][b] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < 501; j++) {
                if (board[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}