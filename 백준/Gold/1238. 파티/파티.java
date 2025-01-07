import java.util.*;

class Main {
    static int n, m, x;
    static int[] dis;
    static ArrayList<ArrayList<Edge>> lists;
    static ArrayList<ArrayList<Edge>> reverseLists;

    public void dijkstra(int start, ArrayList<ArrayList<Edge>> graph, int[] dist) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;
        pQ.offer(new Edge(start, 0));

        while (!pQ.isEmpty()) {
            Edge temp = pQ.poll();
            int now = temp.vertext;
            int nowCost = temp.cost;

            for (Edge ob : graph.get(now)) {
                if (dist[ob.vertext] > nowCost + ob.cost) {
                    dist[ob.vertext] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vertext, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt(); // 마을 수
        m = kb.nextInt(); // 도로 수
        x = kb.nextInt(); // 파티 장소

        lists = new ArrayList<>();
        reverseLists = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            lists.add(new ArrayList<>());
            reverseLists.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt(); // 시작점
            int b = kb.nextInt(); // 도착점
            int c = kb.nextInt(); // 비용
            lists.get(a).add(new Edge(b, c));
            reverseLists.get(b).add(new Edge(a, c)); // 역방향 그래프
        }

        int[] distFromX = new int[n + 1]; // X에서 다른 마을로 가는 거리
        int[] distToX = new int[n + 1];   // 다른 마을에서 X로 가는 거리

        // 1. X에서 다른 마을로 가는 최단 거리
        T.dijkstra(x, lists, distFromX);

        // 2. 다른 마을에서 X로 가는 최단 거리
        T.dijkstra(x, reverseLists, distToX);

        // 3. 왕복 시간 계산
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distFromX[i] != Integer.MAX_VALUE && distToX[i] != Integer.MAX_VALUE) {
                maxTime = Math.max(maxTime, distFromX[i] + distToX[i]);
            }
        }

        System.out.println(maxTime);
    }
}

class Edge implements Comparable<Edge> {
    int vertext;
    int cost;

    public Edge(int vertext, int cost) {
        this.vertext = vertext;
        this.cost = cost;
    }

    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
