import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.*;

class Main {
    public static int maxTemp = 0;
    public static int[] diss;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int cnt2 = 0;
    public static int[][] check;
    public static int[] ch;
    public static int row;
    public static char[][] board;
    public static int col;
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        row = kb.nextInt();
        col = kb.nextInt();
        visited = new boolean[27];
        kb.nextLine();
        board = new char[row][col];
        check = new int[row][col];
        int sum =  1;
        for (int i = 0; i < row; i++) {
            board[i] = kb.nextLine().toCharArray();
        }

        DFS(0, 0,1);
        System.out.println(cnt2);
    }

    public static void DFS(int x, int y, int cnt) {
        char ch = board[x][y];
        cnt2 = Math.max(cnt2, cnt);
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < row && ny >= 0 && ny < col && board[nx][ny] != ch && !visited[board[nx][ny] - 'A']) {
                visited[ch - 'A'] = true;
                DFS(nx, ny, cnt+1);
                visited[ch- 'A'] = false;
            }

        }
    }
}