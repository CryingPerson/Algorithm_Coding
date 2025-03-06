import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int sum = 0;
    public static int white = 0;
    public static int blue = 0;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int N = kb.nextInt();

        int[] dp = new int[N+1];

        dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0){
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            }
        }
        System.out.println(dp[N]);
    }
}