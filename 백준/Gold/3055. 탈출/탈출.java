import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n,m;
    public static char[][] board;
    public static int answer = -1;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean[][] visited;
    public static int[][]water;
    public static int bix;
    public static Queue<Point> waterQu = new LinkedList<>();
    public static int biy;
    public static int wax;
    public static int way;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt(); m = kb.nextInt();
        kb.nextLine();

        water = new int[n][m];
        board = new char[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = kb.nextLine();
            board[i] = s.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'D'){
                    bix = i;
                    biy = j;
                }else if(board[i][j] == '*'){
                    wax = i;
                    way = j;
                    waterQu.add(new Point(i,j));
                    water[i][j] = 0;
                }
            }
        }
        waterse();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 'S'){
                    BFS(i, j);
                }
            }
        }
        if(answer == -1){
            System.out.println("KAKTUS");
        }
        else{
            System.out.println(answer);
        }

    }

    public static void waterse() {
        while (!waterQu.isEmpty()) {
            Point point = waterQu.poll();

            int x = point.x; int y = point.y;


            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == '.' && water[nx][ny] == 0) {
                    water[nx][ny] = water[x][y] + 1;
                    waterQu.add(new Point(nx, ny));
                }
            }
        }
    }
    public static int BFS(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));
        visited = new boolean[n][m];
        visited[x][y] = true;
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point poll = queue.poll();
                if(poll.x == bix && poll.y == biy) {
                    answer = time;
                    return answer;
                }

                for (int j = 0; j < 4; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != 'X' && !visited[nx][ny]) {
                        if(water[nx][ny] > time + 1 || water[nx][ny] == 0){
                            queue.add(new Point(nx,ny));
                            visited[nx][ny] =true;
                        }
                    }
                }

            }
            time++;
        }
        return time;
    }
}
