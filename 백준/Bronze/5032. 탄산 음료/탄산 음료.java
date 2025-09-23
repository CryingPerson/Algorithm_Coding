
import java.text.NumberFormat;
import java.util.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt(); int f = sc.nextInt(); int c = sc.nextInt();


        int cola = 0;
         e = e + f;
        while (e >= c) {
            cola += e / c;
            e = e / c + e % c;
        }
        System.out.println(cola);
    }
}