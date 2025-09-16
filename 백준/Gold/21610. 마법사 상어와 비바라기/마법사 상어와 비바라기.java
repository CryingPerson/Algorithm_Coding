import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[][] board;
    static int[] dx = {0, -1, -1, -1, 0, 1, 1, 1};
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] cloud;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        board = new int[x][x];
        cloud = new boolean[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        cloud[x - 1][0] = cloud[x - 1][1] = cloud[x - 2][0] = cloud[x - 2][1] = true;


        for (int i = 0; i < y; i++) {
            int dir = sc.nextInt() - 1;
            int move = sc.nextInt();

            move(dir, move);
            rain();
            copy();
            newCloud();
        }
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum += board[i][j];
            }
        }
        System.out.println(sum);
    }

    static void newCloud() {
        boolean[][] newCloud = new boolean[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (!cloud[i][j] && board[i][j] >= 2) {
                    newCloud[i][j] = true;
                    board[i][j] -= 2;
                }
            }
        }
        cloud = newCloud;
    }

    static void copy() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (cloud[i][j]) {
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + cx[k];
                        int ny = j + cy[k];

                        if (nx < 0 || ny < 0 || nx >= x || ny >= x) continue;

                        if (board[nx][ny] == 0) continue;

                        cnt++;
                    }
                    board[i][j] += cnt;
                }
            }
        }
    }

    static void rain() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (cloud[i][j]) {
                    board[i][j]++;
                }
            }
        }
    }

    static void move(int dir, int move) {
        boolean[][] temp = new boolean[x][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (cloud[i][j]) {
                    int nx = ((i + dx[dir] * move) % x + x )% x;
                    int ny = ((j + dy[dir] * move) % x + x )% x;
                    temp[nx][ny] = true;
                }
            }
        }
        cloud = temp;
    }
}
