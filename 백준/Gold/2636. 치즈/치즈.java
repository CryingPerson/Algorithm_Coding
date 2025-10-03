import java.io.*;
import java.util.*;

public class Main {
    static int[][] board;
    static int x,y;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static List<int[]> union;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        board = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int day = 0;
        int count = 0;
        while (true) {
            visited = new boolean[x][y];
            union = new ArrayList<>();
            DFS(0,0);
            if (union.size() != 0) {
                count = union.size();
            }
            if(union.size() == 0) break;

            for (int[] pos : union) {
                board[pos[0]][pos[1]] = 0;
            }
            day++;
        }
        System.out.println(day);
        System.out.println(count);
    }

    static void DFS(int a, int b) {
        visited[a][b] = true;

        for (int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;

            if(visited[nx][ny]) continue;

            if (board[nx][ny] == 1) {
                union.add(new int[]{nx,ny});
                visited[nx][ny] = true;
            }else{
                DFS(nx,ny);
            }
        }
    }
}
