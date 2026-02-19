import java.util.*;

public class Main {
    static int n,m;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> contain = new ArrayList<>();
    static int len;
    static boolean end = false;
    static int ans = 0;
    static int[] arrs = new int[7];
    static int min = Integer.MAX_VALUE;
    static int minLen = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nazaen = new int[9];
        for (int i = 0; i < 9; i++) {
            nazaen[i] = sc.nextInt();
        }
        visited = new boolean[9];

        dfs(0, new int[7], nazaen);

        for (int x : arrs) {
            System.out.println(x);
        }
    }

    static void dfs(int depth, int[] comapre, int[] total) {
        if(end) return;
        if (depth == 7) {
            if (check(comapre)) {
                end = true;
                for (int i = 0; i < comapre.length; i++) {
                    arrs[i] = comapre[i];
                }
            }
        }else{
            for (int i = 0; i < 9; i++) {
                if (!visited[i]) {
                    comapre[depth] = total[i];
                    visited[i] = true;
                    dfs(depth + 1, comapre, total);
                    visited[i] = false;
                }
            }
        }
    }

    static boolean check(int[] co) {
        int total = 0;

        for (int x : co) {
            total += x;
        }

        return total == 100;
    }
}

