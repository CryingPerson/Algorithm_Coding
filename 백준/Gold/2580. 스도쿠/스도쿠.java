import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int x, y;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean ok = false;
    static Map<List<Integer>, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        DFS(0,0);

        System.out.println();
    }

    static void DFS(int x, int y) {
        if(ok) return;
        if (x == 9) {
            ok = true;
            print();
            return;
        }

        if (board[x][y] != 0) {
            if (y == 8) {
                DFS(x + 1, 0);
            }else{
                DFS(x, y + 1);
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if(valid(x,y,i)){
                board[x][y] = i;
                if(y == 8) DFS(x + 1, 0);
                else DFS(x, y + 1);
                board[x][y] = 0;
            }
        }
    }

    static void print() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean valid(int x, int y, int num) {
        for (int i = 0; i < 9; i++) {
            if(board[x][i] == num) return false;
            if(board[i][y] == num) return false;

            // 3,5 1,5 2,5 3,5 4,5 ,6,,7
            // 3,0 3,1 3,2
        }

        int orign = x / 3 * 3;
        int origny = y / 3 * 3;

        for (int j = orign; j < orign + 3; j++) {
            for (int k = origny; k < origny + 3; k++) {
                if(board[j][k] == num) return false;
            }
        }
        return true;
    }
}
