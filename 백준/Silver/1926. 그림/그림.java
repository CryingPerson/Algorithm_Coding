import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int maxLevel = 0;
    public static int maxSize = 1;
    public static int[] dx = {-1, 0, 1, 0};
    public static int level = 1;
    public static int x;
    public static int y;
    public static int[] dy = {0, 1, 0, -1};

    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

         x = kb.nextInt();
         y = kb.nextInt();

        board = new int[x][y];
        int cnt = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(board[i][j] == 1){
                    cnt++;
                    board[i][j] = 0;
                    level = 1;
                    DFS(i,j);
                    maxLevel = Math.max(level, maxLevel);
                }
            }
        }
        System.out.println(cnt);
        if(cnt == 0){
            System.out.println(0);
            return;
        }
        System.out.println(maxLevel);
    }
    public static void DFS(int a,int b) {
        for (int i = 0; i < 4; i++) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if (nx >= 0 && nx < x && ny >= 0 && ny < y && board[nx][ny] == 1) {
//                System.out.println("nx :" + nx + "ny : " + ny);
                level++;
                board[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
}
