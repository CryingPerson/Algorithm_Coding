import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[][] board;
    static List<int[]> vacuam;
    static int[][] temp;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt(); int T = sc.nextInt();

        board = new int[x][y];
        temp = new int[x][y];

        vacuam = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int num = sc.nextInt();
                if(num == -1){
                    vacuam.add(new int[]{i,j});
                }
                board[i][j] = num;
                temp[i][j] = num;
            }
        }
        while (T > 0){
            spary();
            clean();


            T--;
        }
        int cnt = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                cnt += board[i][j];
            }
        }
        System.out.println(cnt + 2);
    }
    static void clean(){
            int x = vacuam.get(0)[0];
            int y = vacuam.get(0)[1];

            moveUpper(x,y);


         x = vacuam.get(1)[0];
         y = vacuam.get(1)[1];
         moveLower(x,y);

        for (int i = 0; i < board.length; i++) {
            board[i] = Arrays.copyOf(temp[i], temp[i].length);
        }
    }

    static void moveUpper(int x, int y) {
        int R = temp.length;
        int C = temp[0].length;

        int prev = 0;

        for (int i = y + 1; i < C; i++) {
            int num = temp[x][i];
            temp[x][i] = prev;
            prev = num;
        }

        for (int i = x - 1; i >= 0; i--) {
            int num = temp[i][C-1];
            temp[i][C-1] = prev;
            prev = num;
        }

        for (int i = C - 2; i >= 0; i--) {
            int num = temp[0][i];
            temp[0][i] = prev;
            prev = num;
        }

        for (int i = 1; i < x; i++) {
            int num = temp[i][0];
            temp[i][0] = prev;
            prev = num;
        }
        temp[x][y] = -1;
    }

    static void moveLower(int x, int y) {
        int R = temp.length;
        int C = temp[0].length;

        int prev = 0;

        for (int i = y + 1; i < C; i++) {
            int next = temp[x][i];
            temp[x][i] = prev;
            prev = next;
        }

        for (int i = x + 1; i < R; i++) {
            int next = temp[i][C - 1];
            temp[i][C - 1] = prev;
            prev = next;
        }

        for (int i = C - 2; i >= 0; i--) {
            int next = temp[R - 1][i];
            temp[R - 1][i] = prev;
            prev = next;
        }

        for (int i = R - 2; i > x; i--) {
            int next = temp[i][0];
            temp[i][0] = prev;
            prev = next;
        }

        temp[x][y] = -1;
    }


    static void spary(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] != 0){
                    moreSpary(i,j, board[i][j]);
                }
            }
        }
    }

    static void moreSpary(int x, int y, int num) {
        int minorNumber = num / 5;
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) continue;
            if(board[nx][ny] == -1) continue;
            temp[nx][ny] += minorNumber;
            cnt++;
        }
        temp[x][y] -= minorNumber * cnt;
    }
}
