import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean end = false;
    static boolean[][] visited;
    static int n, m;
    static int[] weigh;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        weigh = new int[n + 1];

        for (int i = 1; i <= n; i++) weigh[i] = sc.nextInt();

        int cur = 1;

        dfs(cur, 0, 0);

        System.out.println(max);
    }

    static void dfs(int cur, int count, int a) {
        if(a > n) return;
        
        if (count == m) {
            max = Math.max(cur, max);
            return;
        }
        if (a == n) {
            max = Math.max(cur, max);
            return;
        }
        if (a + 1 <= n) {
            dfs(cur + weigh[a + 1], count + 1, a + 1);
        }
        if (a + 2 <= n) {
            dfs(cur / 2 + weigh[a + 2], count + 1, a + 2);
        }

    }
}
