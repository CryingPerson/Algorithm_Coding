import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int x,y;
    static int[] P;
    static int[] S;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] board;
    static boolean game;
    static boolean[]visited;
    static char[] boho;
    static int[] number = {0, 1, 2,3,4,5,6,7,8,9};
    static int k;
    static int max = Integer.MIN_VALUE;
    static boolean[] dodo;
    static int aa,bb;
    static int min = Integer.MAX_VALUE;
    static List<List<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt(); y = sc.nextInt();

        list = new ArrayList<>();

        for (int i = 0; i <= x; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < y; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            list.get(to).add(from);
        }


        int bfs = bfs(sc.nextInt());

        System.out.println(bfs);

    }

    static int bfs(int start) {

        int cnt = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        visited = new boolean[x + 1];
        visited[start] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for(int next : list.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    cnt++;
                    queue.add(next);
                }
            }
        }

        return cnt;
    }
}