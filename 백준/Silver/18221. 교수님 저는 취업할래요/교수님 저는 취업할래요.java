import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 123456789
        // 1011121314151617181920

        int n = sc.nextInt();

        int[][] board = new int[n][n];


        int px = -1;
        int py = -1;
        int sx = -1;
        int sy = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 5) {
                    px = i;
                    py = j;
                }
                if (board[i][j] == 2) {
                    sx = i;
                    sy = j;
                }
            }
        }

        double sqrt = Math.sqrt(Math.pow(Math.abs((px - sx)), 2) + Math.pow(Math.abs((py - sy)), 2));

        if (sqrt >= 5) {
            int count = 0;

            if (sy == py) { 
                for (int i = Math.min(px, sx); i <= Math.max(px, sx); i++) {
                    if (board[i][py] == 1) count++;
                }
            }
            else if (sx == px) { 
                for (int i = Math.min(py, sy); i <= Math.max(py, sy); i++) {
                    if (board[px][i] == 1) count++;
                }
            }else {
                int x1 = Math.min(px, sx);
                int x2 = Math.max(px, sx);
                int y1 = Math.min(py, sy);
                int y2 = Math.max(py, sy);

                for (int i = x1; i <= x2; i++) {
                    for (int j = y1; j <= y2; j++) {
                        if (board[i][j] == 1) count++;
                    }
                }

            }
            if (count >= 3) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);


    }
}
