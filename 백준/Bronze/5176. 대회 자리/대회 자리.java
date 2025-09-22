import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt(); int k = sc.nextInt();
            int a = m;
            boolean[] visited = new boolean[k];

            for (int j = 0; j < m; j++) {
                int number = sc.nextInt();
                visited[number - 1] = true;
            }
            for (int j = 0; j < visited.length; j++) {
                if(visited[j]) a--;
            }
            System.out.println(a);
        }
    }
}