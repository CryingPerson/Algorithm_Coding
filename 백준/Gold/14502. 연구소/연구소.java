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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        DFS(0);
        System.out.println(MaxSave);
    }

    public static void DFS(int count) {
        if (count == 3) {
            seach();
            return;
        }else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int num = board[i][j];
                    if (num == 0) {
                        board[i][j] = 1;
                        DFS(count + 1);
                        board[i][j] = 0;
                    }
                }
            }
        }
    }
    public static void seach() {
        Queue<Point> queue = new LinkedList<>();
        int[][] birusCon = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = board[i][j];
                if (num == 2) {
                    queue.add(new Point(i, j));
                }
            }
        }
        for (int i = 0; i < n; i++) {
            birusCon[i] = board[i].clone();
        }
        while (!queue.isEmpty()) {
            Point poll = queue.poll();

            int x = poll.x;
            int y = poll.y;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && birusCon[nx][ny] == 0){
                    birusCon[nx][ny] = 2;
                    queue.add(new Point(nx,ny));
                }
            }
        }

        int areaSave = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(birusCon[i][j] == 0){
                    areaSave++;
                }
            }
        }
        MaxSave = Math.max(areaSave, MaxSave);

    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

