import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int[]dx = {-1,0,1,0};
    public static int[]dy = {0,1,0,-1};
    public static int n;
    public static int[]ch;
    public static char[][] color;
    public static char[][] color2;
    public static ArrayList<ArrayList<Integer>> list;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[][] stiker = new int[2][n];
            int[][] dp = new int[2][n];

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < n; k++) {
                    stiker[j][k] = sc.nextInt();
                }
            }
            if(n == 1){
                System.out.println(Math.max(stiker[0][0] , stiker[1][0]));
                continue;
            }
            if(n == 2){
                int a = stiker[1][0] + stiker[0][1];
                int b = stiker[0][0] + stiker[1][1];
                int res = Math.max(a,b);
                System.out.println(res);
                continue;
            }

            dp[0][0] = stiker[0][0];
            dp[1][0] = stiker[1][0];
            dp[0][1] = stiker[1][0] + stiker[0][1];
            dp[1][1] = stiker[0][0] + stiker[1][1];

            for (int s = 2; s < n; s++) {
                dp[0][s] = Math.max(dp[1][s-1], dp[1][s-2]) + stiker[0][s];
                dp[1][s] = Math.max(dp[0][s-1], dp[0][s-2]) + stiker[1][s];
            }
            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }
    }
}
