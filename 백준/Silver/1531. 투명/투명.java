import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][]board = new int[101][101];

        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            plus(x1,y1,x2,y2,board);
        }
        int cnt = 0;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if(board[i][j] > M) cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void plus(int x1, int y1, int x2, int y2, int[][] board) {
        for(int i = x1; i <= x2; i++) {
            for(int j = y1; j <= y2; j++) {
                board[i][j]++;
            }
        }
    }
}