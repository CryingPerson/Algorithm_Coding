import java.util.*;
class Main {
    static int[] dx = {-1, 0 ,1 , 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;

    static boolean[][] visited;
    static boolean[] tr;
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static char[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = 4 * n - 3;
        if(n == 1){
            System.out.println("*");
            return;
        }
        board = new char[size][size];
        for(int i = 0; i < board.length; i++){
            Arrays.fill(board[i], ' ');
        }
        DFS(n,0,0,size);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == ' '){
                    System.out.print(" ");
                }else System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    static void DFS(int n, int x, int y, int size) {
        if(n == 1){
            board[x][y] = '*';
            return;
        }else{
            for (int i = x; i < size + x; i++) {
                board[i][x] = '*';
                board[i][size + x - 1] = '*';
                if(i == x || i == size + x -1){
                    for (int j = y; j < size + y; j++) {
                        board[i][j] = '*';
                    }
                }
            }
            DFS(n - 1, x +2, y + 2, size - 4);
        }
    }
}