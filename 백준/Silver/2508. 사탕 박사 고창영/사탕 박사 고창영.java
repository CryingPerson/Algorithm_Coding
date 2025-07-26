import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            sc.nextLine(); // 빈 줄

            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine(); // 줄바꿈

            char[][] board = new char[r][c];
            for (int i = 0; i < r; i++) {
                board[i] = sc.nextLine().toCharArray();
            }

            int count = 0;

            // 가로 사탕 >o<
            for (int i = 0; i < r; i++) {
                for (int j = 0; j <= c - 3; j++) {
                    if (board[i][j] == '>' && board[i][j+1] == 'o' && board[i][j+2] == '<') {
                        count++;
                    }
                }
            }

            // 세로 사탕 v o ^
            for (int i = 0; i <= r - 3; i++) {
                for (int j = 0; j < c; j++) {
                    if (board[i][j] == 'v' && board[i+1][j] == 'o' && board[i+2][j] == '^') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
