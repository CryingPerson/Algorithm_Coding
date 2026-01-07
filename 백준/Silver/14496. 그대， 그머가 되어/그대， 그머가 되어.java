import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static int n,m,l;
    static int[][] a;
    static int up = -1, down = -1;

    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};



    static int[] arr;
    static int max = 0;
    static boolean[] vi;
    static boolean ends= false;
    static boolean poss = false;
    static int[] cur;
    static int cn = 0;
    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> list = new ArrayList<>();
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt();

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

        vi = new boolean[n + 1];
        System.out.println(dfs(a, b, 1));
    }

    static int dfs(int start, int end, int cnt) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        vi[start] = true;

        int L = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();

                if(cur == end) return L;

                for (int next : list.get(cur)) {
                    if(vi[next])continue;

                    vi[next] = true;

                    queue.add(next);
                }
            }
            L++;
        }
        return -1;
    }
}
