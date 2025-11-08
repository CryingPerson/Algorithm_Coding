import java.util.*;

public class Main {
    static char[][] grid = new char[10][10];

    static boolean[][] visited;
    static int[][] board;
    static int n, L, R;
    static List<int[]> possible;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();  L = sc.nextInt();  R = sc.nextInt();
         board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int day = 0;

        while (true) {
            boolean end = false;

            visited = new boolean[n][n];
            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if(!visited[i][j]){
                        possible = new LinkedList<>();
                        DFS(i, j);
                    }
                    if (possible.size() > 1) {
                        end = true;
                        simul();
                    }
                }
            }
            if(!end){
                break;
            }
            day++;
        }
        System.out.println(day);

    }

    static void simul() {
        int sum = 0;
        for (int[] pos : possible) {
            int x = pos[0];
            int y = pos[1];

            sum += board[x][y];
        }

        int pairNum = sum / possible.size();
        for (int[] pos : possible) {
            int x = pos[0];
            int y = pos[1];

            board[x][y] = pairNum;
        }

    }

    static void DFS(int x, int y) {
        visited[x][y] = true;

        possible.add(new int[]{x,y});
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

            if(!visited[nx][ny]){
                int num = board[nx][ny];
                int preNum = board[x][y];

                int checkNum = Math.abs(num - preNum);
                if(checkNum >= L && checkNum <= R){
                    DFS(nx,ny);
                }
            }
        }



    }
}
