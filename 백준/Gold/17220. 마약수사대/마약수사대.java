import java.io.IOException;
import java.util.*;
class Main {
    static int max = Integer.MIN_VALUE;

    static int hihi = -1;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] arr;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        sc.nextLine();
        int[] provide = new int[n];
        for (int i = 0; i < m; i++) {
            char[] s = sc.nextLine().toCharArray();

            int from = s[0] - 'A';
            int to = s[2] - 'A';

            provide[to]++;
            list.get(from).add(to);
        }

        String ss = sc.nextLine();


        for (char cc : ss.toCharArray()) {
            if(Character.isAlphabetic(cc)){
                int num = cc-'A';
                visited[num] = true;
            }
        }


        for (int i = 0; i < n; i++) {
            if(provide[i] == 0 && !visited[i]){
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();

            for(int num : list.get(poll)){
                if (!visited[num]) {
                    count++;
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }


    }
}