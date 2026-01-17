import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static int n,m,l;
    static int[][] a;
    static int up = -1, down = -1;

    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};


    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    static int[] number;
    static boolean[] visited;
    static boolean[] nes;
    static List<Character> math;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String ln = sc.next();

            int len = ln.length();

            if (len >= 6 && len <= 9) {
                System.out.println("yes");
            }else System.out.println("no");
        }
    }
}
