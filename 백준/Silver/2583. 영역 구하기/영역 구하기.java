import java.util.*;

class Main {
    static int[][] board;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int x;
    static int sum;
    static int y;
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

         x = kb.nextInt();
         y = kb.nextInt();
        int square = kb.nextInt();

        board = new int[y][x];

        for (int i = 0; i < square; i++) {
            int x1 = kb.nextInt();
            int y1 = kb.nextInt();
            int x2 = kb.nextInt();
            int y2 = kb.nextInt();
            visit(x1,y1,x2-1,y2-1);
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0){
                    sum = 1;
                    board[i][j] = 1;
                    DFS(i,j);
                    list.add(sum);
                }
            }
        }
        list.sort(Comparator.naturalOrder());

        System.out.println(list.size());
        for(int x : list){
            System.out.print(x + " ");
        }

    }
    public static void visit(int x1, int y1, int x2, int y2){
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                board[i][j] = 1;
            }
        }
    }
    public static void DFS(int xx, int yy){

        for (int i = 0; i < 4; i++) {
            int nx = xx + dx[i];
            int ny = yy + dy[i];

            if(nx >= 0 && nx < y && ny >=0 && ny < x && board[nx][ny] == 0){
                board[nx][ny] = 1;
                sum++;
                DFS(nx,ny);
            }
        }
    }
}
