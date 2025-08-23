import java.io.*;
import java.util.*;

class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int count = 0;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new char[n][n];

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int cnt = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == '1'){
                    DFS(i,j);
                    cnt++;
                    list.add(count);
                    count = 0;
                }
            }
        }
        System.out.println(cnt);
        Collections.sort(list);

        for(int x : list) System.out.println(x);
    }

    static void DFS(int x, int y) {
        count++;
        board[x][y] = '0';

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) continue;

            if(board[nx][ny] == '1'){
                DFS(nx,ny);
            }
        }

    }
}