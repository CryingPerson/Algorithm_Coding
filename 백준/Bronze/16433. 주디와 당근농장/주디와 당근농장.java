import java.util.*;
class Main {
    static int[] dx = {-1, -1, 1, 1};
    static int[] dy = {-1, 1, 1, -1};
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt(); int y = sc.nextInt();

        char[][] board = new char[n][n];

        visited = new boolean[n][n];
        for(int i = 0; i < n; i++) Arrays.fill(board[i], '.');

        board[x -1][y - 1]= 'v';
        visited[x-1][y-1]= true;
        start(board,x-1,y-1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

    }

    static void start(char[][] board, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= board.length || ny >= board.length) continue;

            if(board[nx][ny] == '.'){
                board[nx][ny] = 'v';
                visited[nx][ny] = true;
                start(board,nx,ny);
            }
        }
    }
}