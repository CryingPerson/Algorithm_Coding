import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int a = 0; a < t; a++) {

            list.clear();
            n = sc.nextInt();

            int hx = sc.nextInt();
            int hy = sc.nextInt();
            list.add(new int[]{hx, hy});
            for (int i = 0; i < n; i++) {
                int sevenX = sc.nextInt();
                int sevenY = sc.nextInt();

                list.add(new int[]{sevenX, sevenY});
            }
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            list.add(new int[]{ax, ay});

            bfs(hx, hy);
        }
    }

    static void bfs(int sx, int sy) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);

        boolean[] home = new boolean[n + 2];
        home[0] = true;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();


            for (int i = 0; i < n + 2; i++) {
                if (home[i]) continue;
                if (dis(list.get(poll), list.get(i))) {
                    home[i] = true;
                    queue.add(i);
                }
            }
        }

        if (home[n + 1]) {
            System.out.println("happy");
        } else System.out.println("sad");
    }

    static boolean dis(int[] p, int[] s) {
        if (Math.abs(p[0] - s[0]) + Math.abs(p[1] - s[1]) <= 1000) return true;
        return false;
    }
}
