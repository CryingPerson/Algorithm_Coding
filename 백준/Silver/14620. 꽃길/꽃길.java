import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static int n,m,l;
    static int[][] a;
    static int up = -1, down = -1;

    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};


    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    static int[] number;
    static boolean[][] visited;
    static boolean[] nes;
    static List<int[]> flower;
    static int[][] board;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];
        flower = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
                flower.add(new int[]{i, j});
            }
        }

        dfs(0, 0, new ArrayList<>());

        System.out.println(min);

    }

    static void dfs(int start, int depth, List<int[]> listAng) {
        if (depth == 3) {
            visited = new boolean[n][n];
            if (check(listAng)) {
                min = Math.min(min, count());
            }
        }else{
            for (int i = start; i < flower.size(); i++) {
                listAng.add(flower.get(i));
                dfs(i + 1, depth + 1, listAng);
                listAng.remove(listAng.size() - 1);
            }
        }
    }

    static int count() {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(visited[i][j]){
                    cnt += board[i][j];
                }
            }
        }
        return cnt;
    }

    static boolean check(List<int[]> li) {
        for (int i = 0; i < li.size(); i++) {
            int[] ints = li.get(i);

            int curX = ints[0];
            int curY = ints[1];

            if(visited[curX][curY]) return false;
            visited[curX][curY] = true;

            for (int j = 0; j < 4; j++) {
                int nx = curX + dr[j];
                int ny = curY + dc[j];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n) return false;
                if(visited[nx][ny]) return false;

                visited[nx][ny] = true;
            }
        }
        return true;
    }
}
