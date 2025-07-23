import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[][] board;
    static List<int[]> pizza;
    static List<int[]> home;
    static int[] selected;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피자집 위치 다 넣어놓기
        // 뽑은 k개의 피자집에서 각각의 집까지의 거리 계산하기
        // 제일 최솟값들만 모아서 다 합치지기
        // 최솟값 계속해서 갱신 끝
        int n = sc.nextInt();
        int k = sc.nextInt();
        board = new int[n][n];
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        selected = new int[k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num == 2) {
                    pizza.add(new int[]{i, j});
                } else if (num == 1) {
                    home.add(new int[]{i, j});
                }
                board[i][j] = num;
            }
        }

        combinatation(0, 0, k);
        System.out.println(min);
    }

    static void combinatation(int depth, int start, int k) {
        if (depth == k) {
            int total = 0;
            for (int[] h : home) {
                int hx = h[0];
                int hy = h[1];
                int dist = Integer.MAX_VALUE;
                for (int idx : selected) {
                    int[] ints = pizza.get(idx);
                    int px = ints[0];
                    int py = ints[1];

                    dist = Math.min(Math.abs(hx - px) + Math.abs(hy - py), dist);
                }
                total += dist;
            }
            min = Math.min(total, min);
        } else {
            for (int i = start; i < pizza.size(); i++) {
                selected[depth] = i;
                combinatation(depth + 1, i + 1, k);
            }
        }
    }
}
