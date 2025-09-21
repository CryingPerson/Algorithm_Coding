import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
        board = new int[n][n];
        snake = new boolean[n][n];
        int k =sc.nextInt();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt(); int y = sc.nextInt();
            board[x-1][y-1] = 1;
        }

        int m = sc.nextInt();
        sc.nextLine();
        int dir = 0;
        int x = 0; int y = 0;
        Queue<int[]> gori = new LinkedList<>();
        int Time = 0;
        snake[x][y] = true;
        gori.add(new int[]{x,y});
        for (int i = 0; i < m; i++) {
            String[] lines = sc.nextLine().split(" ");

            int t = Integer.parseInt(lines[0]);
            String cmd = lines[1];

            while (Time <= t) {
                if (Time == t) {
                    if (cmd.equals("D")) {
                        dir = (dir + 1) % 4;
                    }else dir = (dir + 3) % 4;
                }

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || ny < 0 ||nx >= n || ny >= n || snake[nx][ny]) {
                    System.out.println(Time + 1);
                    return;
                }

                if (board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    gori.add(new int[]{nx,ny});
                }else {
                    int[] poll = gori.poll();
                    gori.add(new int[]{nx,ny});
                    snake[poll[0]][poll[1]] = false;
                }
                snake[nx][ny] = true;

                x = nx;
                y = ny;
                Time++;
            }

        }
        while (true) {

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 ||nx >= n || ny >= n || snake[nx][ny]) {
                System.out.println(Time + 1);
                return;
            }

            if (board[nx][ny] == 1) {
                gori.add(new int[]{nx,ny});
            }else {
                int[] poll = gori.poll();
                gori.add(new int[]{nx,ny});
                snake[poll[0]][poll[1]] = false;
            }
            snake[nx][ny] = true;

            x = nx;
            y = ny;
            Time++;
        }

    }
}