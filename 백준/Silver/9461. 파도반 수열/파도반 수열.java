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
        long[]dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(num == 1 || num == 2 || num == 3){
                if(num == 1){
                    System.out.println(1);
                }else if(num == 2){
                    System.out.println(1);
                }else{
                    System.out.println(1);
                }
            }else{
                System.out.println(dp[num]);
            }
        }
    }
}

