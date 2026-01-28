import java.util.*;

public class Main {

    static int[] board;
    static  int[] dx = {-2,-2,-1,-1, 1, 1, 2, 2};
    static  int[] dy = {-1, 1,-2, 2,-2, 2,-1, 1};
    static boolean end = false;
    static boolean[][] visited;
    static int n, m;
    static int[] dis;
    static int[] set;
    static int[] one;
    static long max = Long.MIN_VALUE;
    static int[] exam;
    static int[] disable;
    static boolean ends = false;
    static int[] move = {1, 2};

    static int curColor;
    static int maxLength;

    static boolean[] pass;
    static List<int[]> list = new ArrayList<>();

    static int sx, ex;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int parent = 0;
        if (n >= 1000000) {
            parent = (int)(n * 0.2);
        } else if (n <= 1000000 && n >= 500000) {
            parent = (int) (n * 0.15);
        } else if (n < 500000 && n >= 100000) {
            parent = (int) (n * 0.1);
        }else parent = (int)(n * 0.05);

        System.out.print(parent + " " + (n - parent));
    }
}