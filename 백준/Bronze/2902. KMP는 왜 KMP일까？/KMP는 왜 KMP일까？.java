import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n,m;
    public static char[][] board;
    public static int answer = -1;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean[][] visited;
    public static int[][]water;
    public static int bix;
    public static Queue<Point> waterQu = new LinkedList<>();
    public static int biy;
    public static int wax;
    public static int way;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String[]st = kb.nextLine().split("-");
        String s = "";

        for(String se : st){
            s += se.charAt(0);
        }
        System.out.println(s);
    }
}
