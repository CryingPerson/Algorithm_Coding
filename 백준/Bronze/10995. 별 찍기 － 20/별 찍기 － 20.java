import java.math.BigInteger;
import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static boolean[] visited;
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] snake;
    static boolean[][] temp;
    static int[][] board;

    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  =sc.nextInt();


        for (int i = 0; i < n; i++) {
            char c = ' ';
            if (i % 2 == 0) {
                c = '*';
            }
            for (int j = 0; j < n * 2; j++) {
                System.out.print(c);
                c = c == '*' ? ' ' : '*';
            }
            System.out.println();
        }

    }
}
