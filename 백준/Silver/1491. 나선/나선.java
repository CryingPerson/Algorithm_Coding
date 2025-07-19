import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int aaaasd = 0;
    static boolean[][] check;
    static String[][] st = {{".",".",".","."}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st2 = {{"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st3 = {{"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st4 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}};
    static String[][] st5 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        int[] dx = {1, 0 ,-1 ,0};
        int[] dy = {0, 1, 0, -1};


        int[][] board = new int[x][y];
        boolean[][] checked = new boolean[x][y];
        int dir = 0; int ax = 0; int ay = 0; int num = 1;
        int findX = -1; int findY = -1;
        int total = x * y;
        while (num <= total) {
            board[ax][ay] = num;
            checked[ax][ay] = true;
            num++;
            if(board[ax][ay] == total){
                findX = ax;
                findY = ay;
                break;
            }
            int nx = ax + dx[dir];
            int ny = ay + dy[dir];

            if (nx < 0 || nx >= x || ny < 0 || ny >= y || checked[nx][ny]) {
                dir = (dir + 1) % 4;
                nx = ax + dx[dir];
                ny = ay + dy[dir];
            }

            ax = nx;
            ay = ny;
        }
        System.out.println(findX + " " + findY);
    }
}
