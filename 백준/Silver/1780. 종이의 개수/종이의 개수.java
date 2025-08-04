import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[3];
    static boolean[][] check;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        check = new boolean[n][n];
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        divide(board,0,0,n);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    static void divide(int[][] board, int x, int y, int size) {
        if(check(board,x,y,size)){
            get(board,x,y,size);
            return;
        }

        int newSize = size / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                divide(board,  x +i * newSize,  y + j  * newSize, newSize);
            }
        }
    }

    static void get(int[][] board, int x, int y, int size) {
        int cnt = 0;

        if(board[x][y] == -1){
            arr[0] ++;
        }else if(board[x][y] == 0){
            arr[1] ++;
        }else arr[2] ++;
    }

    static boolean check(int[][] board, int x, int y, int size) {
        int num = board[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(num != board[i][j])return false;
            }
        }

        return true;
    }
}