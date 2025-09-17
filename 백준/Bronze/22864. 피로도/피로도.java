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

        int piro = sc.nextInt(); int finisih = sc.nextInt();
        int minus = sc.nextInt(); int max = sc.nextInt();

        int t = 0;

        int total = 0;
        int curPiro = 0;
        while (t < 24) {
            if (curPiro + piro <= max) {
                curPiro += piro;
                total += finisih;
            }else {
                curPiro -= minus;
                if(curPiro < 0){
                    curPiro = 0;
                }
            }
            t++;
        }
        System.out.println(total);

    }
}
