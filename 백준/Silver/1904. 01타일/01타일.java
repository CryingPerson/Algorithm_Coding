import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int answer = 0;
    static int[][] board;
    static int white = 0;
    static int blue = 0;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

         n = kb.nextInt();
         int []dp = new int[n+1];
         if(n == 1 || n == 2){
             if(n == 1){
                 System.out.println(1);
                 return;
             }else{
                 System.out.println(2);
                 return;
             }
         }
         dp[1] = 1;
         dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] % 15746 + dp[i-1] % 15746;
        }
        System.out.println(dp[n] % 15746);

    }


}

