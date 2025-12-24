import java.io.IOException;
import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    static boolean[] visited;
    static List<List<Integer>> list;
    static int[] arr;
    static int count = 0;
    static Set<String> set;
    static boolean cycle;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            list = new ArrayList<>();
            cycle = false;
            set = new HashSet<>();
            int n = sc.nextInt();
            for (int j = 0; j <= n; j++) {
                list.add(new ArrayList<>());
            }

            int m = sc.nextInt();
            boolean ch = false;
            for (int j = 0; j < m; j++) {
                int from = sc.nextInt() - 1;
                int to = sc.nextInt() - 1;

                int min = Math.min(from, to);
                int min2 = Math.max(from, to);
                String an = min + "," + min2;

                if(!set.add(an)){
                    ch = true;
                }
                list.get(from).add(to);
                list.get(to).add(from);
            }

            visited = new boolean[n + 1];

            dfs(0, -1);

            boolean tree = false;
            for (int j = 0; j < n; j++) {
                if(!visited[j]) {
                    tree = true;
                }
            }

            if(ch || tree || cycle){
                System.out.println("graph");
            }else {
                System.out.println("tree");
            }

        }
    }

    static void dfs(int start, int parent) {
        visited[start] = true;
        for (int child : list.get(start)) {
            if(!visited[child]){
                dfs(child, start);
            } else if (child != parent) {
                cycle = true;
            }
        }
    }
}