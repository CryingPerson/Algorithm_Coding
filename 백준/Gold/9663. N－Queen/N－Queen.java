import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static int n;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

        board = new int[n][n];

        DFS(0);
        System.out.println(count);
    }

    static void DFS(int row) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if(valid(row, col)){
                board[row][col] = 1;
                DFS(row + 1);
                board[row][col] = 0;
            }
        }
    }

    static boolean valid(int x, int y) {
        for (int i = 0; i < n; i++) {
            if(board[i][y] == 1) return false;
        }

        int pos = 1;
        for (int i = x - 1; i >= 0; i--) {
            if(y - pos < 0) continue;
            if(board[i][y - pos] == 1) return false;
            pos++;
        }
        int pos2 = 1;
        for (int i = x - 1; i >= 0; i--) {
            if(y + pos2 >= n) continue;
            if(board[i][y + pos2] == 1) return false;
            pos2++;
        }

        return true;
    }
}