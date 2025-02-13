import java.util.Scanner;

public class Main {
    static int[][] board;
    static int blue = 0;
    static int white = 0;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        DFS(0,0, n);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void DFS(int row, int col, int size) {
        if(check(row,col,size)){
            if(board[row][col] == 1) blue++;
            else white++;
            return;
        }

        int banSize = size/2;
        DFS(row, col , banSize);
        DFS(row, col + banSize, banSize);
        DFS(row + banSize, col , banSize);
        DFS(row + banSize, col + banSize, banSize);
    }
    public static boolean check(int row, int col, int size) {
        int a = board[row][col];
        for(int i = row; i<row + size; i++){
            for(int j = col; j<col + size; j++){
                if(board[i][j] != a) return false;
            }
        }
        return true;
    }
}
