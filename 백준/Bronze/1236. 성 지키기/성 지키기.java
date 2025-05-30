import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] board = new char[n][m];
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 'X'){
                    flag = true;
                }
            }
            if(!flag){
                ans++;
            }
        }
        int anss = 0;
        for(int i = 0; i < m; i++) {
            boolean flag = false;
            for(int j = 0; j < n; j++) {
                if(board[j][i] == 'X'){
                    flag = true;
                }
            }
            if(!flag){
                anss++;
            }
        }
        System.out.println(Math.max(ans, anss));

    }
}
