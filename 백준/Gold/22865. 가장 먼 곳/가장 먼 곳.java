import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int n;
    static List<List<node>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to  =sc.nextInt();
            int cost  = sc.nextInt();

            list.get(from).add(new node(to, cost));
            list.get(to).add(new node(from, cost));
        }
        dic(arr);

        int maxDist = -1;
        int answerNode = -1;

        for (int i = 1; i <= n; i++) {
            if (dist[i] > maxDist) {
                maxDist = dist[i];
                answerNode = i;
            } else if (dist[i] == maxDist) {
                if (answerNode == -1 || i < answerNode) {
                    answerNode = i;
                }
            }
        }
        System.out.println(answerNode);

    }

    static void dic(int[] start) {
        PriorityQueue<node> queue = new PriorityQueue<>((o1, o2) -> {
            return o1.cost - o2.cost;
        });

        dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int num : start) {
            dist[num] = 0;
            queue.add(new node(num, 0));
        }

        while (!queue.isEmpty()) {
            node cur = queue.poll();

            if(dist[cur.to] < cur.cost) continue;
            for(node next : list.get(cur.to)){
                if(dist[next.to] > dist[cur.to] + next.cost){
                    dist[next.to] = dist[cur.to] + next.cost;
                    queue.add(new node(next.to, dist[next.to]));
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