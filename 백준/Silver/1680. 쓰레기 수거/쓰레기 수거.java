import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int n;
    static int cc = 1;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int W = sc.nextInt();
            int N = sc.nextInt();

            int backup = W;
            int total = 0;
            int pre = 0;

            for (int j = 0; j < N; j++) {
                int len = sc.nextInt(); int weigh = sc.nextInt();

                pre = len;

                if (W < weigh) {
                    total += 2 * len;
                    W = backup;
                }

                W -= weigh;

                if (W == 0) {
                    total += 2 * len;
                    W = backup;
                }
            }
            if (W != backup) {
                total += 2 * pre;
            }
            System.out.println(total);
        }

    }

}