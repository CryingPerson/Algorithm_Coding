import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static char[][] board;
    static int a1 = 0;
    static int b1 = 0;
    static boolean[][] booleans;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m =sc.nextInt();

        sc.nextLine();
        board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j < m; j++) {
                if(board[i][j] != '#'){
                    s += board[i][j];
                }else{
                    if (s.length() > 1) {
                        list.add(s);
                    }
                    s = "";
                }
            }
            if(s.length() > 1){
                list.add(s);
            }
        }

        for (int i = 0; i < m; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if(board[j][i] != '#'){
                    s += board[j][i];
                }else{
                    if (s.length() > 1) {
                        list.add(s);
                    }
                    s = "";
                }
            }
            if(s.length() > 1){
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
