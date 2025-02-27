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

        n = sc.nextInt();
        int maxArea = -1;
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                board[i][j] = num;
            }
        }
        for (int i = 1; i <= 100; i++) {
            int ans = 0;
            int[][] temp = new int[n][n];
            for (int j = 0; j < n; j++) {
                temp[j] = board[j].clone();
            }
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    int num = board[a][b];
                    if(num <= i){
                        temp[a][b] = 1;
                    }else{
                        temp[a][b] = 0;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                for (int s = 0; s < n; s++) {
                    int num = temp[k][s];
                    if(num == 0){
                        ans++;
                        temp[k][s] = 1;
                        DFS(k,s,temp);
                    }
                }
            }
            maxArea = Math.max(ans, maxArea);
        }
        if(maxArea == 0){
            System.out.println(1);
            return;
        }
        System.out.println(maxArea);
    }
    public static void DFS(int x, int y, int[][]temp) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && temp[nx][ny] == 0) {
                temp[nx][ny] = 1;
                DFS(nx, ny, temp);
            }
        }
    }
}

