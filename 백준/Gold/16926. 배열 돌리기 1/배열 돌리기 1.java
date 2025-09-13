import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static int cc = 1;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();

        board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < k; i++) {
            roate();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void roate() {
        int min = Math.min(board.length, board[0].length);

        int layer = min / 2;

        int inx = 1;
        for (int i = 0; i < layer; i++) {
            int left = i;
            int right = board[0].length - i;
            int down = board.length - i;
            int top = i;

            int pre = board[i][i + 1];

            int temp;

            for (int j = top; j < down; j++) {
                temp = board[j][left];
                board[j][left] = pre;
                pre = temp;
            }

            for (int j = left + 1; j < right; j++) {
                temp = board[down - 1][j];
                board[down -1][j] = pre;
                pre = temp;
            }

            for (int j = down - 2; j >= top; j--) {
                temp = board[j][right - 1];
                board[j][right - 1] = pre;
                pre = temp;
            }

            for (int j = right - 2; j >= left; j--) {
                temp = board[top][j];
                board[top][j] = pre;
                pre = temp;
            }



        }
    }

}