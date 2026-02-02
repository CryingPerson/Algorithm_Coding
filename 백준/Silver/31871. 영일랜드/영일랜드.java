import java.io.*;
import java.util.*;

public class Main {
    static int N = -1;
    static int[][] S;
    static boolean[] visited;
    static int ans = Integer.MAX_VALUE;
    static int n;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

        int m = sc.nextInt();

        S = new int[n + 1][n + 1];

        visited = new boolean[n + 1];
        for (int j = 0; j < m; j++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();

            S[start][end] = Math.max(S[start][end], cost);
        }


        dfs(0, 0, 0);

        System.out.println(N);
    }

    static void dfs(int start, int depth, int sum) {

        if(depth == n){

            if (S[start][0] != 0) {
                N = Math.max(N, S[start][0] + sum);
            }
        }else{

            for (int next = 1; next <= n; next++) {
                if(!visited[next] && S[start][next] != 0){
                    visited[next] = true;
                    dfs(next, depth + 1, sum + S[start][next]);
                    visited[next] = false;
                }
            }
        }
    }
}
