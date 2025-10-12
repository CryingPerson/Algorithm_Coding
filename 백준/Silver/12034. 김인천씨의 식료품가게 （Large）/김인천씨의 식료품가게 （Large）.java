import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static boolean[][] board;
    static int n;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();
            List<Integer> ans = new ArrayList<>();
            for(int j = 0; j < m * 2; j++) queue.add(sc.nextInt());

            int len = queue.size();
            for (int j = 0; j < len; j++) {
                if(ans.size() == m) break;
                int num = queue.poll();

                int price = (int)(num * 0.75);

                if(queue.contains(price)){
                    ans.add(price);
                    queue.remove(price);
                }
                else queue.add(num);
            }
            System.out.print("Case #" + i + ": ");
            Collections.sort(ans);
            for(int x : ans) System.out.print(x + " ");
            System.out.println();
        }
    }
}