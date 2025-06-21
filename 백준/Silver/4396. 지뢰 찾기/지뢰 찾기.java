import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1 , 0, -1}; // 오른쪽, 아래
    static int[] dy = {0, 1, 1, 1, 0 ,-1 , -1, -1};
    static char[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;
    static int[][] ans;
    static int[] alpabet = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        board = new char[n][n];
        ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                board[i] = s.toCharArray();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arount(i,j);
            }
        }
        char[][] compare = new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                compare[i] = s.toCharArray();
            }
        }
        String[][] answer = new String[n][n];
        boolean game = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(compare[i][j] == 'x'){
                    answer[i][j] = String.valueOf(ans[i][j]);
                }else{
                    answer[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(compare[i][j] == 'x' && board[i][j] == '*'){
                    get(answer);
                    return;
                }
            }
        }
        for (String[] st : answer) {
            for (String s : st) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
    static int arount(int x, int y){
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || nx >= ans.length || ny < 0 || ny >= ans.length)continue;
            if(board[nx][ny] == '*') cnt++;
        }
        return cnt;
    }
    static void get(String[][] answer){

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(board[i][j] == '*'){
                    System.out.print('*');
                }else{
                    System.out.print(answer[i][j]);
                }
            }
            System.out.println();
        }
    }
}

