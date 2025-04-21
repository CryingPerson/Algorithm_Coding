import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static Set<String> list = new HashSet<>();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        sc.nextLine();
        board = new char[row][col];

        for (int i = 0; i < row; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < col; j++) {
                board[i][j] = line[j];
            }
        }
        int maxLen = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for(int k = 0; k + i < row && k + j < col; k++) {
                    if(board[i][j] == board[i][j + k] &&
                    board[i][j] == board[i+k][j+k] &&
                    board[i][j] == board[i+k][j])
                        maxLen = Math.max(maxLen, k + 1);
                }
            }
        }
        int answer = maxLen * maxLen;
        System.out.println(answer);
    }
}
