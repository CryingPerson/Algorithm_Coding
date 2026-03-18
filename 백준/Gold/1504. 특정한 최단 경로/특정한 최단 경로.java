import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    static String s;
    static int[] arr;
    static int n,m,r;
    static boolean[] visited;

    static Set<Integer> ans = new HashSet<>();
    static List<List<node>> list = new ArrayList<>();
    static int[] dist;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0 , 1, 0, -1};
    static boolean[] robot;
    static int[][] board;
    static int[] belt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();

            list.get(from).add(new node(to, cost));
            list.get(to).add(new node(from, cost));
        }

        int first = sc.nextInt(); int second = sc.nextInt();

        dic(1);
        int temp = dist[first];
        dic(first);
        int temp2 = dist[second];
        dic(second);
        int temp3 = dist[n];

        if (temp == Integer.MAX_VALUE || temp2 == Integer.MAX_VALUE || temp3 == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else {
            int sum = temp3 + temp2 + temp;
            dic(1);
            int temp12 = dist[second];
            dic(second);
            int temp23 = dist[first];
            dic(first);
            int temp34 = dist[n];

            int sum2 = temp12 + temp23 + temp34;

            System.out.println(Math.min(sum2, sum));
        }


    }

    static void dic(int start) {

        dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        Queue<node> queue = new ArrayDeque<>();

        queue.add(new node(start, 0));

        while (!queue.isEmpty()) {
            node cur = queue.poll();

            int curNext = cur.to;
            int curCost = cur.cost;

            if(dist[curNext] < curCost) continue;

            for (node nextNode : list.get(curNext)) {
                if (dist[nextNode.to] > dist[curNext] + nextNode.cost) {
                    dist[nextNode.to] = dist[curNext] + nextNode.cost;
                    queue.add(new node(nextNode.to, dist[nextNode.to]));
                }
            }
        }

    }
}

class node{
    int to;
    int cost;

    public node(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}
