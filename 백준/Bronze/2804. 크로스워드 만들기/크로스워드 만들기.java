import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] split = s.split(" ");
        String a = split[0];
        String b = split[1];

        int col = a.length();
        int row = b.length();

        char[][] board = new char[row][col];

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }

        int idx = 0;
        int x = -1; int y= -1;
        boolean visited = false;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(visited) continue;
            for (int j = 0; j < b.length(); j++) {
                if(ch == b.charAt(j)){
                    x = j;
                    y = i;
                    visited = true;
                    break;
                }
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            board[x][i] = a.charAt(i);
        }

        for (int i = 0; i < board.length; i++) {
            board[i][y] = b.charAt(i);
        }
        for (char[] ch : board) {
            for (char c : ch) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}
