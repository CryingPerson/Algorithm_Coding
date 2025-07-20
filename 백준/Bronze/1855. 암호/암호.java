import java.util.*;

public class Main {
    static int[] dx = {0, -1, 0, 1}; // ← ↑ → ↓
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();

        int row = s.length() / k;

        char[][] board = new char[row][k];


        int idx = 0;
        for (int i = 0; i < row; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < k; j++) {
                    board[i][j] = s.charAt(idx++);
                }
            }else{
                for (int j = k - 1; j >= 0; j--) {
                    board[i][j] = s.charAt(idx++);
                }
            }

        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                sb.append(board[j][i]);
            }
        }
        System.out.println(sb);
    }
}
