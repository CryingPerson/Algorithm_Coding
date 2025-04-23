import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            char[] ch = sc.nextLine().toCharArray();
            for(int j = 0; j < n; j++) {
                board[i][j] = ch[j];
            }
        }

        int garo = 0;
        for (int i = 0; i < n; i++) {
            int len = 0;
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '.'){
                    len++;
                }else{
                    len = 0;
                }
                if(len == 2){
                    len++;
                    garo++;
                }
            }
        }

        int selo = 0;
        for (int i = 0; i < n; i++) {
            int len = 0;
            for(int j = 0; j < n; j++) {
                if(board[j][i] == '.'){
                    len++;
                }else{
                    len = 0;
                }
                if(len == 2){
                    len++;
                    selo++;
                }
            }
        }
        System.out.print(garo + " " + selo);
    }
}