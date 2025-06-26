import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static char[][] ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[N][N];
        ans = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            board[i] = s.toCharArray(); 
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                make(board, i, j);
            }
        }
        for (char[] ch : ans) {
            for (char ss : ch) {
                System.out.print(ss);
            }
            System.out.println();
        }
    }

    static void make(char[][] board, int x, int y) {
        if(Character.isDigit(board[x][y])){
            ans[x][y] = '*';
            return;
        }
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < ans.length && ny >= 0 && ny < ans.length) {
                if(Character.isDigit(board[nx][ny])){
                    sum += (board[nx][ny] - '0');
                }
            }
        }
        if (sum >= 10) {
            ans[x][y] = 'M';
        }else{
            ans[x][y] = (char)(sum + '0');
        }
    }
}
