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

        int[][] dp = new int[T][3];
        int[][] home = new int[T][3];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 3; j++) {
                home[i][j] = sc.nextInt();
            }
        }
        dp[0][0] = home[0][0];
        dp[0][1] = home[0][1];
        dp[0][2] = home[0][2];

        for (int i = 1; i < T; i++) {
            for (int j = 0; j < 3; j++) {
                if(j == 0){
                    dp[i][j] = Math.min(dp[i-1][j+1], dp[i-1][j+2]) + home[i][j];
                }else if(j == 2){
                    dp[i][j] = Math.min(dp[i-1][j-2], dp[i-1][j-1]) + home[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1], dp[i-1][j+1]) + home[i][j];
                }
            }
        }
        System.out.println(Math.min(dp[T-1][0], Math.min(dp[T-1][1],dp[T-1][2])));
    }
}
