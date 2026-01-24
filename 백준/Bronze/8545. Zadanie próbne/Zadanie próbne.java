import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
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
    static boolean[] vi;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(new StringBuilder(s).reverse());
    }
}