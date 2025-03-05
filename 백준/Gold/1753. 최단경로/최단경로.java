import java.util.*;

class Main {
    public static ArrayList<ArrayList<Edge>> list;
    public static int max = Integer.MAX_VALUE;
    public static int[]dis;
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        list = new ArrayList<>();
        int V = kb.nextInt();
        int E = kb.nextInt();
        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }
        dis = new int[V+1];
        Arrays.fill(dis, max);
        int start = kb.nextInt();
        for (int i = 0; i < E; i++) {
            int u = kb.nextInt();
            int v = kb.nextInt();
            int w = kb.nextInt();

            list.get(u).add(new Edge(v,w));

        }
        dicstra(start);
        for (int i = 1; i <= V; i++) {
            if(dis[i] == max){
                System.out.println("INF");
            }else{
                System.out.println(dis[i]);
            }
        }
    }

    public static void dicstra(int start) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        dis[start] = 0;
        queue.add(new Edge(start, 0));

        while (!queue.isEmpty()) {
            Edge poll = queue.poll();

            int nowVer = poll.verx;
            int nowCost = poll.cost;

            for(Edge ob : list.get(nowVer)){
                if(dis[ob.verx] > nowCost + ob.cost){
                    dis[ob.verx] = nowCost + ob.cost;
                    queue.add(new Edge(ob.verx, ob.cost + nowCost));
                }
            }
        }
    }
}
class Edge implements Comparable<Edge>{
    int verx;
    int cost;
    public Edge(int verx, int cost){
        this.verx = verx;
        this.cost = cost;
    }
    public int compareTo(Edge o){
        return this.cost - o.cost;
    }
}
