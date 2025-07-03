import java.util.*;

public class Main {

    static char[][] board;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;

            sc.nextLine();
             board = new char[n][m];
            char[][] ans = new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    board[i][j] = line.charAt(j);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(board[i][j] == '*'){
                        ans[i][j] = '*';
                    }else{
                        int num = get(i, j);
                        ans[i][j] = (char)(num + '0');
                    }
                }
            }
            for (char[] ch : ans) {
                for (char cc : ch) {
                    System.out.print(cc);
                }
                System.out.println();
            }
        }
    }

    static int get(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= board.length || ny >= board[0].length) continue;
            if(board[nx][ny] == '*') cnt++;
        }
        return cnt;
    }
}

