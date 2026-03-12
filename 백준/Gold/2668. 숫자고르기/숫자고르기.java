import java.util.*;

public class Main {
    static String s;
    static int[] arr;
    static int n;
    static boolean[] visited;

    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            dfs(i , i);
        }
        Collections.sort(list);

        System.out.println(list.size());
        for (int x : list) {
            System.out.println(x);
        }
    }

    static void dfs(int start, int target) {
        if (arr[start] == target) {
            list.add(target);
            return;
        }

        if (!visited[start]) {
            visited[start] = true;
            dfs(arr[start], target);
        }
    }
}
