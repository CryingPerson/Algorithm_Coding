import java.io.IOException;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    static char[][] board;
    static int white;
    static int black;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
         board = new char[n][m];
         sc.nextLine();
        for (int i = 0; i < n; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int result = 999;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                black = 0;
                white = 0;
                result = Math.min(visit(i,j), result);
            }
        }
        System.out.println(result);
    }
    public static int visit(int x, int y){
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if((i+j) % 2 ==0){
                    if(board[i][j] == 'B') white++;
                    if(board[i][j] == 'W') black++;
                }else{
                    if(board[i][j] == 'W') white++;
                    if(board[i][j] == 'B') black++;
                }
            }
        }
        return Math.min(white,black);
    }
}
