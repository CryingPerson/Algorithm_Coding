import java.util.*;

public class Main {
    static int[] dx = {0, 1}; // 오른쪽, 아래
    static int[] dy = {1, 0};
    static int[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < N; j++) {
                board[i] = s.toCharArray();
            }
        }
        int headX = 0;
        int headY = 0;
        boolean check = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(check) continue;
                if (board[i][j] == '*') {
                    headX = i + 1;
                    headY = j + 1;
                    check = true;
                }
            }
        }

        String[] st = new String[]{"left", "right", "huge", "Llefgs", "Rlefgs"};
        System.out.println(headX + 1 + " " + headY);
        for (int i = 0; i < st.length; i++) {
            int left = get(st[i], headX, headY-1, board);
            System.out.print(left + " ");
        }
    }

    static int get(String dir, int x, int y, char[][] board) {
        int a = 0;
        int b = 0;
        if (dir.equals("left")) {
            for (int i = y-1; i >= 0; i--) {
                if (board[x][i] == '*') b++;
            }
        } else if (dir.equals("right")) {
            for (int i = y+1; i < board.length; i++) {
                if(board[x][i] == '*') b++;
            }
        } else if (dir.equals("huge")) {
            for (int i = x+1; i < board.length; i++) {
                if(board[i][y] == '*'){
                    b++;
                }else if(board[i][y] == '_'){
                    xx = i;
                    yy = y;
                    break;
                }
            }
        } else if (dir.equals("Llefgs")) {
            for (int i = xx; i < board.length; i++) {
                if (board[i][y - 1] == '*') {
                    b++;
                }
            }
        }else{
            for (int i = xx; i < board.length; i++) {
                if (board[i][y + 1] == '*') {
                    b++;
                }
            }
        }

        return b;
    }
}
