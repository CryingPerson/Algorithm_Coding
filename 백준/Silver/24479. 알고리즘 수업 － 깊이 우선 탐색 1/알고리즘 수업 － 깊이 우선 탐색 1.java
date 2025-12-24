import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] arr;
    static int co = 1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int start = sc.nextInt();

        visited = new boolean[n + 1];
        arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();

            list.get(from).add(to);
            list.get(to).add(from);
        }

        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }

        visited[start] = true;
        arr[start] = 1;
        dfs(start, 1);

        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void dfs(int start, int plus) {

        for(int num : list.get(start)){
            if(!visited[num]){
                co++;
                arr[num] = co;
                visited[num] = true;
                dfs(num, plus);
            }
        }
    }
}