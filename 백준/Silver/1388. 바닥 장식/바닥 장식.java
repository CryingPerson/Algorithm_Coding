import java.util.Scanner;

public class Main {
    static char[][] board;
    static int a1 = 0;
    static int b1 = 0;
    static boolean[][] booleans;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        sc.nextLine();
        board = new char[x][y];

        booleans = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            String lines = sc.nextLine();
            for (int j = 0; j < y; j++) {
                board[i][j] = lines.charAt(j);
            }
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!booleans[i][j]) {
                    DFS(i,j, board[i][j]);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static void DFS(int x, int y, char ch) {
        booleans[x][y] = true;
        if(ch == '-'){
            simul(x,y,ch,0,2);
        }else{
            simul(x,y,ch,2,4);
        }
    }

    static void simul(int x, int y, char ch, int a, int b) {
        for (int k = a; k < b; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length || booleans[nx][ny]) continue;
            if(board[nx][ny] != ch) continue;
            DFS(nx,ny,ch);
        }
    }
}
