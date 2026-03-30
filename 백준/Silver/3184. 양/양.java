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

        board = new int[R][C];

        sc.nextLine();
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                if(line.charAt(j) == '.') board[i][j] = 1;
                else if(line.charAt(j) == '#') board[i][j] = 2;
                else if(line.charAt(j) == 'o') board[i][j] = 3;
                else board[i][j] = 4;
            }
        }

        visited = new boolean[R][C];
        
        int yang = 0;
        int wolf = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(!visited[i][j] && (board[i][j] == 3 || board[i][j] == 4)){
                    visited[i][j] = true;
                    int[] bfs = bfs(i, j);

                    yang += bfs[0];
                    wolf += bfs[1];
                }
            }
        }
        System.out.println(yang + " " + wolf);

    }

    static int[] bfs(int x, int y) {
        int ya=  0;
        int w = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            int cx = cur[0];
            int cy = cur[1];

            if(board[cx][cy] == 3){
                ya++;
            }else if(board[cx][cy] == 4){
                w++;
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if(visited[nx][ny]) continue;
                if(board[nx][ny] == 2) continue;
                visited[nx][ny] = true;

                queue.add(new int[]{nx,ny});
            }
        }

        if (ya > w) {
            return new int[]{ya, 0};
        }else return new int[]{0, w};
    }
}