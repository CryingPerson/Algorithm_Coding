import java.awt.*;
import java.util.*;

class Main {
    public static int row;
    public static char[][] board;
    public static int col;
    public static int[]ch;
    public static int wall = 0;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int N;
    public static int M;
    public static boolean[][] check;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int F = kb.nextInt(); int S = kb.nextInt(); int G = kb.nextInt(); int U = kb.nextInt(); int D = kb.nextInt();
        ch = new int[F+1];
        int bfs = BFS(F, S, G, U, D);
        if(bfs == -1) {
            System.out.println("use the stairs");
            return;
        }
        System.out.println(bfs);
    }
    public static int BFS(int F, int S, int G, int U, int D) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);

        int L = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();

                if(poll == G) return L;

                for (int j = 0; j < 2; j++) {
                    int next = poll + U;
                    int next2 = poll - D;

                    if(next >= 1 && next <= F && ch[next] == 0){
                        ch[next] = 1;
                        queue.add(next);
                    }
                    if(next2 >= 1 && next2 <= F && ch[next2] == 0){
                        ch[next2] = 1;
                        queue.add(next2);
                    }
                }
            }
            L++;
        }
        return -1;
    }
}
