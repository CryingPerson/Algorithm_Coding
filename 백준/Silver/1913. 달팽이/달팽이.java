import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[]arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int startX = n / 2;
        int startY = n / 2;

        int[][] board = new int[n][n];

        int find = sc.nextInt();

        int num = 1;
        board[startX][startY] = num;
        int dirss = 0;
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int plus = 1;
        boolean end = true;
        while (num < n * n) {
            for (int i = 0; i < 2; i++) {
                if(!end) break;
                int[] point = dir[(dirss + 4) % 4];
                int nx = -1;
                int ny = -1;
                for (int j = 0; j < plus; j++) {
                    num++;
                    if(num > n * n){
                        end = false;
                        break;
                    }

                     nx = startX + point[0];
                     ny = startY + point[1];

                    board[nx][ny] = num;
                    startX = nx;
                    startY = ny;
                }
                dirss++;
            }
            plus++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == find) {
                    System.out.print(i + 1 + " ");
                    System.out.print(j + 1);
                    return;
                }
            }
        }
    }
}