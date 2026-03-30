import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int R, C;
    static int[] P;
    static int[] S;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dir;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt(); C = sc.nextInt();

        board = new int[C][R];

        sc.nextLine();
        for (int i = 0; i < C; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < R; j++) {
                if(line.charAt(j) == 'W') board[i][j] = 1;
                else board[i][j] = 2;
            }
        }

        visited = new boolean[C][R];
        int w = 0;
        int b = 0;
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < R; j++) {
                if(!visited[i][j]){
                    if(board[i][j] == 1) w += bfs(i, j);
                    else{
                        b += bfs(i ,j);
                    }
                }
            }
        }

        System.out.print(w + " " + b);

    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{x,y});
        visited[x][y] = true;
        int cnt = 1;

        int stand = board[x][y];
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= C || ny >=R) continue;
                if(visited[nx][ny] || board[nx][ny] != stand) continue;
                visited[nx][ny] = true;
                cnt++;
                queue.add(new int[]{nx,ny});
            }
        }



        return cnt * cnt;
    }
}