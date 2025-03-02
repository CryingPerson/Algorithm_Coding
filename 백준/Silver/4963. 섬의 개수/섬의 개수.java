import java.util.*;

public class Main {
    public static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    public static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        cnt++;
                        DFS(i, j, matrix);
                    }
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }

    public static void DFS(int x, int y, int[][] view) {
     
        view[x][y] = 0;

 
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

        
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && view[nx][ny] == 1) {
                DFS(nx, ny, view);
            }
        }
    }
}