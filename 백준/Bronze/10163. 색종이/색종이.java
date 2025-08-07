import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] board = new int[1002][1002];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt(); int y = sc.nextInt();
            int hegiht = sc.nextInt(); int wei = sc.nextInt();

            for (int j = x; j < x + hegiht; j++) {
                for (int k = y; k < y + wei; k++) {
                    board[j][k] = i;
                }
            }
        }
        int[] arr = new int[n+1];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                if(board[i][j] == 0) continue;
                arr[board[i][j]]++;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 0){
                System.out.println(0);
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}
