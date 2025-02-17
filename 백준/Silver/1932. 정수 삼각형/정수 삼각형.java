

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] tringle = new int[n][n];

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                tringle[i][j] = kb.nextInt();
            }
        }
        dp[0][0] = tringle[0][0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0){
                    dp[i][j] = tringle[i][j] + dp[i-1][j];
                }else if(i == j){
                    dp[i][j] = tringle[i][j] + dp[i-1][j-1];
                }else{
                    dp[i][j] = tringle[i][j] + Math.max(dp[i-1][j-1],dp[i-1][j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            max = Math.max(dp[n-1][i], max);
        }
        System.out.println(max);
    }

}
