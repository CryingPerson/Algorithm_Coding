import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;

    static List<int[]> start;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int to = sc.nextInt();
            int from = sc.nextInt();

            list.get(to).add(from);
            list.get(from).add(to);

        }

        int[] childs = new int[n + 1];
        dfs(childs,1, list);
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= n; i++) {
            sb.append(childs[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int[] childs, int parent, List<List<Integer>> list) {

        for(int chiled : list.get(parent)){
            if (childs[chiled] == 0) {
                childs[chiled] = parent;
                dfs(childs, chiled, list);
            }
        }

    }
}