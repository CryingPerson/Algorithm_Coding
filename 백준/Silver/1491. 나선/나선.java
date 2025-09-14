import java.util.*;

public class Main {
    static int[] dx = {1, 0 ,-1 ,0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int startX = 0;
        int startY = 0;

        int dir = 0;
        int total = x * y;
        int num = 1;
        boolean[][] check = new boolean[x][y];

        while (num < total) {

            check[startX][startY] = true;

            int nx = startX + dx[dir];
            int ny = startY + dy[dir];

            if (nx < 0 || ny < 0 || nx >= x || ny >= y || check[nx][ny]) {
                dir = (dir + 1) % 4;
                nx = startX + dx[dir];
                ny = startY + dy[dir];
            }

            startX = nx;
            startY = ny;

            num++;

        }

        System.out.println(startX + " " + startY);
    }
}
