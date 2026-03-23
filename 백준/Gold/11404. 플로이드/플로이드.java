import java.util.*;

public class Main {
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int[][] dist; // 불의 전파 시간
    static List<List<node>> list = new ArrayList<>();

    static boolean[] visited;
    static int[] child;
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
        }

        for (int i = 1; i <= n; i++) {
            int[] dist = dic(i);

            for (int j = 1; j <= n; j++) {
                if (dist[j] == Integer.MAX_VALUE) {
                    System.out.print(0 + " ");
                }else System.out.print(dist[j] + " ");
            }
            System.out.println();
        }
    }

    static int[] dic(int start) {
        int[] dist = new int[n + 1];

        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<node> queue = new PriorityQueue<>( (o1, o2) -> {
            return o1.cost - o2.cost;
        });

        queue.add(new node(start, 0));
        dist[start] = 0;
        while (!queue.isEmpty()) {
            node cur = queue.poll();
            
            if(dist[cur.to] < cur.cost) continue;

            for(node nextNode : list.get(cur.to)){
                if (dist[nextNode.to] > dist[cur.to] + nextNode.cost) {
                    dist[nextNode.to] = dist[cur.to] + nextNode.cost;
                    queue.add(new node(nextNode.to, dist[nextNode.to]));
                }
            }
        }
        return dist;
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