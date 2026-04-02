import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int x,y;
    static int[] P;
    static int[] S;

    static int[] dx = {-1, 1, 0, 0}; 
    static int[] dy = {0, 0, -1, 1};
    static int[][] board;
    static boolean game;
    static boolean[][] visited;
    static char[] boho;
    static int[] number = {0, 1, 2,3,4,5,6,7,8,9};
    static int k;
    static int max = Integer.MIN_VALUE;
    static boolean[] dodo;
    static int aa,bb;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt();
        board = new int[x][y];

        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < y; j++) {
                char c = line.charAt(j);

                if(c == '.'){
                    board[i][j] = 1;
                }else if(c == '#') board[i][j] = 0;
                else if(c == 'k') board[i][j] = 2;
                else board[i][j] = 3;
            }
        }

        visited = new boolean[x][y];

        int yy = 0;
        int ss = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(!visited[i][j] && board[i][j] != 0){
                    aa = 0; bb = 0;

                    dfs(i, j);
                    if(aa > bb){
                        bb = 0;
                    }else aa = 0;

                    yy += aa; ss += bb;
                }
            }
        }

        System.out.println(yy + " " + ss);


    }

    static void dfs(int sx, int sy) {
        visited[sx][sy] = true;

        if(board[sx][sy] == 2) aa++;
        else if(board[sx][sy] == 3) bb++;

        for (int i = 0; i < 4; i++) {
            int nx = sx + dx[i];
            int ny = sy + dy[i];

            if(nx < 0 || ny < 0 || nx >= x || ny >= y) continue;
            if(visited[nx][ny]) continue;
            if(board[nx][ny] == 0) continue;
            visited[nx][ny] = true;

            dfs(nx,ny);
        }
    }
}