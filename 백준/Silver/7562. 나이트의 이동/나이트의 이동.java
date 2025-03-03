import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    public static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static int n;
    public static int m;
    public static int[][] color;
    public static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
             n = sc.nextInt();
            int[][] board = new int[n][n];
            visited = new boolean[n][n];
            int a = sc.nextInt();
            int b = sc.nextInt();

            int findA = sc.nextInt();
            int findB = sc.nextInt();
            int bfs = BFS(a, b, findA, findB);
            System.out.println(bfs);
        }
    }

    public static int BFS(int x, int y, int findX, int findY) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point poll = queue.poll();
                visited[poll.x][poll.y] = true;
                if(poll.x == findX && poll.y == findY) return L;

                for (int j = 0; j < 8; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];

                    if(nx == findX && ny == findY) return L+1;
                    if(nx >=0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        queue.add(new Point(nx,ny));
                    }
                }
            }
            L++;
        }
        return L;
    }
}
class Point{
    int x;
    int y;
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}
