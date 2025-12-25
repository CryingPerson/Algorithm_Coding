import java.util.*;

public class Main {
    static int n;
    static int[][] board;

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<List<Integer>> list = new ArrayList<>();

            for (int j = 0; j <= N; j++) {
                list.add(new ArrayList<>());
            }

            for (int j = 0; j < M; j++) {
                int from = sc.nextInt();
                int to = sc.nextInt();

                list.get(from).add(to);
                list.get(to).add(from);
            }

            int min = Integer.MAX_VALUE;
            boolean[] visited = new boolean[N + 1];
            count = 0;
            tree(visited, 1, list);
            min = Math.min(min, count);

            System.out.println(min);
        }
    }

    static void tree(boolean[] visited, int start, List<List<Integer>> list) {
        visited[start] = true;
        for(int next : list.get(start)){
            if(!visited[next]){
                count++;
                tree(visited, next, list);
            }
        }
    }
}
