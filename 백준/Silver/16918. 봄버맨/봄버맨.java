import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[3];
    static char[][] board;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt(); int t = sc.nextInt();

        board = new char[x][y];
        sc.nextLine();
        for (int i = 0; i < x; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < y; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        if(t == 1){
            print(board);
        }
        else if(t % 2 ==0){
            fill(board);
            print(board);
        }else{
            char[][] after = extend(board);
            if(t % 4 == 3){
                print(after);
            }else{
                char[][] extend = extend(after);
                print(extend);
            }
        }
    }

    static char[][] extend(char[][] board) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        char[][] newBoard = new char[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            Arrays.fill(newBoard[i], 'O');
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O'){
                    newBoard[i][j] = '.';
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k]; int ny = j + dy[k];

                        if(nx < 0 || nx >= board.length || ny < 0 || ny >= board[0].length) continue;

                        newBoard[nx][ny] = '.';
                    }
                }
            }
        }
        return newBoard;
    }

    static void fill(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], 'O');
        }
    }

    static void print(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}