import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = Integer.MIN_VALUE;
    static boolean[][] visited;

    static int[][] pan;
    static int[][] dist;
    static char[][] board;
    static int n, m;

    static boolean[][] wall;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();



        pan = new int[n][m];
        board = new char[n][m];
        wall = new boolean[n][m];
        sc.nextLine();

        int start = 0; int start2 = 0;
        int end = 0; int end2 = 0;
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);

                if(board[i][j] == 'S'){
                    start = i; start2 = j;
                }else if(board[i][j] == 'E'){
                    end = i; end2 = j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(board[i][j] == '#') continue;

                for (int k = 0; k < 4; k++) {

                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                    if(board[nx][ny] == '#'){
                        wall[i][j] = true;
                        break;
                    }
                }
            }
        }


        dist = new int[n][m];

        discstra(start, start2);

        if (dist[end][end2] == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else System.out.println(dist[end][end2]);
    }

    static void discstra(int x, int y) {

        Deque<int[]> deque = new LinkedList<>();

        deque.add(new int[]{x,y});

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[x][y] = 0;

        while (!deque.isEmpty()) {

            int[] pos = deque.poll();

            int cx = pos[0];
            int cy = pos[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(board[nx][ny] == '#') continue;

                int plus = (wall[cx][cy] && wall[nx][ny]) ? 0 : 1;

                if (dist[nx][ny] > dist[cx][cy] + plus) {
                    dist[nx][ny] = dist[cx][cy] + plus;

                    if(plus == 0){
                        deque.addFirst(new int[]{nx,ny});
                    }else deque.addLast(new int[]{nx,ny});
                }

            }
        }
    }
}