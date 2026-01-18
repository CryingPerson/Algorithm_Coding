import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static int n,m,l;
    static int[][] a;
    static int up = -1, down = -1;

    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};



    static char[] answer = {'3', '4', '5'};
    static int[] arr;
    static int max = 0;
    static boolean[] vi;
    static boolean ends= false;
    static boolean poss = false;
    static int[] cur;
    static int cn = 0;
    static char[][] board;
    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> possbile;
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            list.get(from).add(to);
            list.get(to).add(from);
        }

        int bfs = bfs();

        Collections.sort(possbile);
        System.out.println(possbile.get(0) + " " + bfs + " " + possbile.size());
    }

    static int bfs() {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);

        vi = new boolean[n + 1];

        vi[1] = true;

        int L = 0;

        possbile = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();

            possbile.clear();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();

                possbile.add(poll);

                for(int next : list.get(poll)){
                    if(!vi[next]){
                        vi[next] = true;
                        queue.add(next);
                    }
                }
            }
            L++;
        }
        return L - 1;
    }
}
