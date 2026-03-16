import java.util.*;

public class Main {
    static String s;
    static int[] arr;
    static int n,m,r;
    static boolean[] visited;

    static Set<Integer> ans = new HashSet<>();
    static List<List<int[]>> list = new ArrayList<>();
    static int[] dist;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt(); r = sc.nextInt();

        int[] save = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            save[i] = num;
        }
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < r; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();

            list.get(from).add(new int[]{ to, cost});
            list.get(to).add(new int[]{from, cost});
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            dic(i);
            int total = 0;
            for (int j = 1; j <= n; j++) {
                if (dist[j] <= m) {
                    total += save[j];
                }
            }
            max = Math.max(max, total);
        }
        System.out.println(max);
    }

    static void dic(int start) {
         dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[start] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int[] next : list.get(cur)) {

                if(dist[next[0]] > dist[cur] + next[1]){
                    dist[next[0]] = dist[cur] + next[1];
                    queue.add(next[0]);
                }
            }
        }
    }
}
