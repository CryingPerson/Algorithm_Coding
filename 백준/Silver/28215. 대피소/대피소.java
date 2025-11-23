import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] visited;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long min = Integer.MAX_VALUE;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  k = sc.nextInt();

        if(n == k){
            System.out.println(0);
            return;
        }
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            point.add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        DFS(0, 0);

        System.out.println(min);

    }

    static void DFS(int l, int start) {
        if (avoidHome.size() == k) {
            min = Math.min(min, simi());
            return;
        }

        for (int i = start; i < point.size(); i++) {
            avoidHome.add(point.get(i));
            visited[i] = true;
            DFS(l + 1, i + 1);
            visited[i] = false;
            avoidHome.remove(avoidHome.size() - 1);
        }
    }

    static long simi() {




        long max = Long.MIN_VALUE;
        for (int i = 0; i < point.size(); i++) {
            int[] pos = point.get(i);
            if(visited[i]) continue;
            int px = pos[0]; int py = pos[1];

            long min = Long.MAX_VALUE;
            for (int j = 0; j < avoidHome.size(); j++) {
                int[] apos = avoidHome.get(j);

                int ax = apos[0]; int ay = apos[1];

                int distnce = Math.abs(px - ax) + Math.abs(py - ay);

                min = Math.min(min, distnce);

            }
            max = Math.max(max ,min);
        }
        return max;
    }
}
