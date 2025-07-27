import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        sc.nextLine();

        char[][] board = new char[x * 2][y * 2];

        for (int i = 0; i < x; i++) {
            String line = sc.nextLine();
            for(int j = 0 ;j < y; j++){
                board[i][j] = line.charAt(j);
            }
        }

        right(board);
        down(board);

        int a = sc.nextInt(); int b = sc.nextInt();

        if(board[a-1][b-1] == '.'){
            board[a-1][b-1] = '#';
        }else{
            board[a-1][b-1] = '.';
        }
        for (char[] ch : board) {
            for (char c : ch) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void down(char[][] board) {
        int idx = 1;
        for (int i = board.length / 2; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = board[i- idx][j];
            }
            idx += 2;

        }
    }
    static void right(char[][] board) {
        for (int i = 0; i < board.length / 2; i++) {
            int idx = 1;
            for (int j = board[0].length / 2; j < board[0].length; j++) {
                board[i][j] = board[i][j - idx];
                idx += 2;
            }
        }
    }
}
