import java.io.*;
import java.util.*;

public class Main {
    static int N = -1;
    static int[][] S;
    static boolean[] visited;
    static int ans = Integer.MAX_VALUE;
    static long n, m;

    static boolean end = false;
    static List<List<Integer>> list = new ArrayList<>();
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextLong();

        int sum = 0;
        System.out.println((n - 1) * n / 2);
        System.out.println(2);
    }

}
