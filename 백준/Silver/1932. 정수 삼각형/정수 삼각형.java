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
    static int area = -1;
    static int[] ch;
    static int[] paraent;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][]dp = new int[n][n];
        if(n== 1){
            System.out.println(arr[0][0]);
            return;
        }
        int see = 0;
        if(n== 2){
            see = Math. max(arr[0][0]+arr[1][0], arr[0][0] + arr[1][1]);
            System.out.println(see);
            return;
        }
        dp[0][0] = arr[0][0];
        dp[1][0] = arr[0][0] + arr[1][0];
        dp[1][1] = arr[0][0] + arr[1][1];

        for (int i = 2; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                }
                else if(j == i) {
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i-1][j] + arr[i][j]);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(dp[n-1][i],result);
        }
        System.out.println(result);
    }
}

