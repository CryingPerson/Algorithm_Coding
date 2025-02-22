import java.io.*;
import java.util.*;

class Main {
    static int[][] board = new int[11][11]; // -5 ~ 5의 범위를 0 ~ 10으로 매핑
    static int[] dx = {-1,0,1,0}; // U, D, L, R
    static int[] dy = {0,1,0,-1}; // U, D, L, R

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            Set<Integer> map = new HashSet<>();
            int m = Integer.parseInt(br.readLine());
            StringTokenizer str = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                int num = Integer.parseInt(str.nextToken());
                map.add(num);
            }
            int k = Integer.parseInt(br.readLine());
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < k; j++) {
                sb.append(map.contains(Integer.parseInt(str.nextToken())) ? 1 : 0).append('\n');
            }
            System.out.print(sb);
        }
    }
}