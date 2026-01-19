import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean end = false;
    static boolean[][] visited;
    static int n, m;
    static int[] weigh;
    static int[] set;
    static int[] one;
    static int[] exam;
    static int[] disable;
    static int[] move = {1, 2};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        disable = new int[n];

        for(int i = 0; i < n; i++) disable[i] = sc.nextInt();

        int bfs = bfs(0);

        System.out.println(bfs);
    }

    static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[250001];
        queue.add(start);
        visited[0] = true;

        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int poll = queue.poll();

                if(poll > disable[disable.length - 1]) return L;
                for (int j = 0; j < 2; j++) {
                    int nx = poll + move[j];
                    boolean possblie = true;
                    for (int k = 0; k < n; k++){
                        if(disable[k] == nx) {
                            possblie = false;
                            break;
                        }
                    }
                    if(!possblie) continue;
                    if(visited[nx]) continue;

                    visited[nx] = true;

                    queue.add(nx);
                }

            }
            L++;
        }
        return -1;
    }
}
