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

    static boolean[] cups;
    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        cups = new boolean[3];

        cups[0] = true;

        for (char c : s.toCharArray()) {
            if(c == 'A'){
                swap1(0,1);
            }else if(c == 'B'){
                swap1(1,2);
            }else swap1(0,2);
        }

        int idx = 1;
        for (boolean ok : cups) {
            if (ok) {
                System.out.println(idx);
                return;
            }else idx++;
        }

    }
    static void swap1(int from, int to){
        boolean temp = cups[from];
        cups[from] = cups[to];
        cups[to] = temp;
    }
}
