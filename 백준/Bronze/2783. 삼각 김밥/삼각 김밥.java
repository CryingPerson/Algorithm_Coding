import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        double pi = 1000 / (double)m;

        double ans = pi * n;

        int aaaa = sc.nextInt();
        double max = ans;
        for (int i = 0; i < aaaa; i++) {
            int num = sc.nextInt(); int price = sc.nextInt();

            double pii = 1000 / (double) price;

            double aa = pii * num;

            max = Math.min(max, aa);
        }
        System.out.printf("%.2f", max);
    }

}