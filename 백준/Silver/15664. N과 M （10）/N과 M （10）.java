
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int[][] board;
    static int[][] dis;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] ans;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = kb.nextInt();
        }
        Arrays.sort(ans);
        ch = new int[n];

        answer = new int[m];
        int L = 0;
        DFS(L,0);

        System.out.println(sb);
    }

    public static void DFS(int L, int s) {
        if (L == m) {
            for (int x : answer) sb.append(x).append(" ");
            sb.append("\n");
            return;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = s; i < n; i++) {
            if(!set.contains(ans[i])){

                answer[L] = ans[i];
                set.add(ans[i]);
                DFS(L+1, i+1);
            }
        }
    }


}

