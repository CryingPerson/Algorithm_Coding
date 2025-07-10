import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt(); int x = sc.nextInt();

        int[][] board = new int[x][y];

        int a = 0; int b = 0; int dir = 0;
        for (int i = 1; i <= x * y; i++) {
            board[a][b] = i;

            int nx = a + dx[dir]; int ny = b + dy[dir];

            if(nx < 0 || nx >= x || ny < 0 || ny >= y || board[nx][ny] != 0){
                dir = (dir + 1) % 4;
                nx = a + dx[dir];
                ny = b + dy[dir];
            }

            a = nx;
            b = ny;
        }
        int[][] answer = new int[x][y];

        for (int i = x - 1; i >= 0; i--) {
            for(int j = 0; j < y; j++){
                answer[x-i-1][j] = board[i][j];
            }
        }
        int find = sc.nextInt();
        int ans = 0;
        int ans2 = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (answer[i][j] == find) {
                     ans = x - i;
                     ans2 = j + 1;
                }
            }
        }
        if (ans2 == 0 && ans == 0) {
            System.out.println(0);
            return;
        }
        System.out.print(ans2 + " " + ans);

    }
}
