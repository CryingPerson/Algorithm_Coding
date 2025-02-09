

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static  ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long[] d = new long[a+1];
            long dp = dp(a, d);
            System.out.println(dp);
        }
    }
    public static long dp(int a, long[] d){
        if(a == 0 || a == 1 || a == 2) return 1;
         d[1] = 1;
         d[2] = 1;
         d[3] = 1;
        for (int i = 3; i <= a; i++) {
            d[i] = d[i-3] + d[i-2];
        }
        return d[a];
    }
}
