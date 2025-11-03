import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player = sc.nextInt();

        char a = 'O';
        char b = 'X';

        char start = player == 1 ? a : b;

        char[][] board = new char[3][3];

        for (int i = 0; i < 9; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;


            board[x][y] = start;

            boolean check = check(board, 'O');
            boolean check1 = check(board, 'X');

            if(check){
                System.out.println(1);
                return;
            }else if(check1){
                System.out.println(2);
                return;
            }
            start = start == a ? b : a;
        }
        System.out.println(0);
    }

    static boolean check(char[][] board, char n) {
        boolean ok = true;
        for (int i = 0; i < 3; i++) {
            if(board[i][i] != n) {
                ok = false;
                break;
            }
        }
        if(ok) return true;

        boolean ok2 = true;
        for (int i = 0; i < 3; i++) {
            if(board[i][2 - i] != n){
                ok2 = false;
                break;
            }
        }
        if(ok2) return true;

        for (int i = 0; i < 3; i++) {
            boolean ok3 = true;
            for (int j = 0; j < 3; j++) {
                if(board[i][j] != n){
                    ok3 = false;
                    break;
                }
            }
            if(ok3) return true;
        }


        for (int i = 0; i < 3; i++) {
            boolean ok4 = true;
            for (int j = 0; j < 3; j++) {
                if(board[j][i] != n)
                    ok4 = false;
            }
            if(ok4) return true;
        }

        return false;
    }
}
