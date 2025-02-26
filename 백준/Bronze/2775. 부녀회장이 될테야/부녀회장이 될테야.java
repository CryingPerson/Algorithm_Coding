import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list1;
    static int n, m;
    static int[][] board;
    static int MaxSave = -1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[][] dp = new int[15][15];
        for (int i = 1; i < 15; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
            }
        }
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(dp[k][n]);
        }
    }
}

