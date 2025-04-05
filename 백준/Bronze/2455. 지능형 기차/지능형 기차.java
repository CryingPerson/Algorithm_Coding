import java.util.*;

public class Main {
    static int[][] board;

    public static int[] dx = {-2, -2, 0, 0, 2, 2};
    public static int[] dy = {-1, 1, -2, 2, -1, 1};
    public static int r1;
    public static int c1;
    public static int r2;
    public static int c2;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            sum += b - a;
            max = Math.max(max, sum);
        }
        System.out.println(max);

    }
}