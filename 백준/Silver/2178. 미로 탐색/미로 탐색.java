

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static  ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;
    static int[] ch;
    static int max = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        board = new int[n+1][m+1];
        dis = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine(); // 한 줄을 입력받음
            for (int j = 1; j <= m; j++) {
                board[i][j] = line.charAt(j - 1) - '0'; // '1' -> 1, '0' -> 0 변환
            }
        }
        int answer = 1;
        DFS(1,1,n,m,answer);
        System.out.println(dis[n][m]+1);
    }

    public static void DFS(int x, int y,int n, int m, int answer) {
        Queue<point> q = new LinkedList<>();
        q.add(new point(x,y));
        board[x][y] = 1;
        while (!q.isEmpty()){
            point poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if(nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[nx][ny] == 1){
                    board[nx][ny] = 0;
                    q.add(new point(nx,ny));
                    dis[nx][ny] = dis[poll.x][poll.y]+1;
                }
            }
        }
    }
}
class point{
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
