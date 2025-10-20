import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static boolean[][] visited;
    static int max = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static  int count = 0;
    static Map<String , Integer> dir = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt(); int r = sc.nextInt();
        board = new int[x][y];
        dir.put("N",0);
        dir.put("E",1);
        dir.put("S",2);
        dir.put("W",3);
        visited = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                visited[i][j] = true;
            }
        }

        for (int i = 0; i < r; i++) {
            int ax = sc.nextInt(); int ay = sc.nextInt(); String dir = sc.next();

            start(ax - 1,ay - 1,dir);
            int dx = sc.nextInt() - 1; int dy = sc.nextInt() - 1;

            visited[dx][dy] = true;
        }

        System.out.println(count);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(visited[i][j]) System.out.print("S ");
                else System.out.print("F ");
            }
            System.out.println();
        }
    }

    static void start(int x, int y, String di) {
        if(!visited[x][y]) return;

        int range = board[x][y];

        int nx = x;
        int ny = y;
        while (range > 0) {

            if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) break;

            if (visited[nx][ny]) {
                visited[nx][ny] = false;
                count++;
                range = Math.max(range, board[nx][ny]);
            }
            nx = dx[dir.get(di)] + nx;
            ny = ny + dy[dir.get(di)];
            range--;
        }

    }
}
