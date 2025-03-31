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

        int k = sc.nextInt(); int count = sc.nextInt(); int price = sc.nextInt();

        if(k * count <= price) System.out.println(0);
        else System.out.println(k * count - price);

    }
}