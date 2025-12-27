
import java.util.*;

public class Main {
    static int n,m;
    static int[][] board;

    static int count = 0;

    static List<int[]> virus = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;
    static List<List<edge>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();


        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }


        for (int i = 0; i < n - 1; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int w = sc.nextInt();

            list.get(from).add(new edge(to, w));
            list.get(to).add(new edge(from, w));
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            int bfs = bfs(start, end);
            System.out.println(bfs);
        }
    }

    static int bfs(int start, int end) {
        Queue<int[]> queue = new LinkedList<>();

        visited = new boolean[n + 1];
        visited[start] = true;
        queue.add(new int[]{start, 0});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            int cur = poll[0];
            int curW = poll[1];

            for(edge next : list.get(cur)){
                int num = next.to;
                int nw = next.w;

                if(num == end) return curW + nw;

                if(!visited[num]){
                    visited[num] = true;
                    queue.add(new int[]{num, curW + nw});
                }
            }
        }
        return -1;

    }
}
class edge{
    int to;
    int w;

    public edge(int to, int w) {
        this.to = to;
        this.w = w;
    }
}
