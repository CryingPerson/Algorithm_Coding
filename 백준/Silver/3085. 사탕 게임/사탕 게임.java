import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
        board = new char[n][n];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            char[] st = sc.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                board[i][j] = st[j];
            }
        }
        int answer = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j + 1 < n){
                    swap(i,j,i,j+1);
                    answer = Math.max(answer,count());
                    swap(i,j,i,j+1);
                }

                if(i + 1 < n){
                    swap(i,j,i+1,j);
                    answer = Math.max(answer,count());
                    swap(i,j,i+1,j);
                }
            }
        }
        System.out.println(answer);
    }
    public static int count(){
        int cnt;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            cnt = 1;
            for(int j = 1; j < n; j++) {
                if(board[i][j] == board[i][j-1]){
                    cnt++;
                }else{
                    cnt = 1;
                }
                ans = Math.max(ans, cnt);
            }
        }
        for(int i = 0; i < n; i++) {
            cnt = 1;
            for(int j = 1; j < n; j++) {
                if(board[j][i] == board[j-1][i]){
                    cnt++;
                }else{
                    cnt = 1;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
    public static void swap(int x, int y, int x2, int y2){
        char temp = board[x][y];
        board[x][y] = board[x2][y2];
        board[x2][y2] = temp;
    }
}
