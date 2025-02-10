

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int[][] dis;
    static int[] ch;
    static int cnt;
    static int max = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        board = new int[n + 1][n + 1];
        dis = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String line = sc.nextLine(); // 한 줄을 입력받음
            for (int j = 1; j <= n; j++) {
                board[i][j] = line.charAt(j - 1) - '0'; // '1' -> 1, '0' -> 0 변환
            }
        }
        int answer = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(board[i][j] == 1){
                    answer++;
                    cnt = 1;
                    board[i][j] = 0;
                    DFS(i,j, n, n);
                    list1.add(cnt);
                }
            }
        }
        System.out.println(answer);
        Collections.sort(list1);
        for(int x : list1){
            System.out.println(x);
        }
    }

    public static void DFS(int x, int y, int n, int m) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[nx][ny] == 1) {
                cnt++;
                board[nx][ny] = 0;
                DFS(nx,ny,n,m);
            }
        }
    }
}

class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
