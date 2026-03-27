import java.util.*;

public class Main {
    static int T;
    static List<Integer>[][] gears;

    static int[] dist;
    static int R, C;
    static int[] P;
    static int[] S;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dir;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[200];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a]++;
        }

        int total = 0;
        for (int i = 0; i < 200; i++) {
            if (i == 136) {
                total += (1000 * arr[i]);
            } else if (i == 142) {
                total += (5000 * arr[i]);
            } else if (i == 148) {
                total += (10000 * arr[i]);
            }else{
                total += (50000 * arr[i]);
            }
        }
        System.out.println(total);
    }
}