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
        list1 = new ArrayList<>();
        int n = sc.nextInt();

        // 첫번쨰 두번쨰 네번쨰 VS 첫번쨰 세번쨰 네번쨰 중 큰걸 찾아야함
        // 구조적으로 두번쨰부터 시작하면 위에꺼보다 클수가 없으니 제외하고 시작하자
        int[] dp = new int[n];
        int[]stairs = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = sc.nextInt();
            stairs[i] = dp[i];
        }
        if(n == 1){
            System.out.println(dp[0]);
            return;
        }
        if(n== 2){
            System.out.println(dp[0] + dp[1]);
            return;
        }
        dp[0] = stairs[0];
        dp[1] = stairs[0] + stairs[1];
        dp[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-3] + stairs[i-1] + stairs[i], dp[i-2]+ stairs[i]);
        }
        System.out.println(dp[n-1]);
    }
}

