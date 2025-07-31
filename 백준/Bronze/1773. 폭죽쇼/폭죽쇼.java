import java.io.*;
import java.util.*;

class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}; // U R D L
    static int[] dy = {0, 1, 0, -1};
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        boolean[] check = new boolean[c + 1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            for (int j = num; j <= c; j += num) {
                if (!check[j]) {
                    check[j] = true;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
