import java.io.*;
import java.util.*;

public class Main {
    static int N = -1;
    static int[][] S;
    static boolean[] visited;
    static int ans = Integer.MAX_VALUE;
    static int n;

    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        combi(0, 0);

        System.out.println(ans);
    }

    static void combi(int start, int depth) {
        if (depth == n / 2) {
            calculate();
        }else{

            for (int i = start; i < n; i++) {
                visited[i] = true;
                combi(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    static void calculate() {
        int star =0;
        int lin  =0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if(visited[i] && visited[j]){
                    star += board[i][j] + board[j][i];
                } else if (!visited[i] && !visited[j]) {
                    lin += board[i][j] + board[j][i];
                }
            }
        }

        ans = Math.min(Math.abs(star - lin), ans);
    }

}
