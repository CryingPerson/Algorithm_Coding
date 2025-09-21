import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt();

        int a = x;
        int b = x;


        // 4,8
        // 3,6

        // 4 6
        // 3 8

        for (int i = 0; i < y; i++) {
            int X = sc.nextInt(); int Y = sc.nextInt();

            // 세로
            int aa = a * Y;

            // 가로
            int bb = b * X;

            if (bb >= aa) {
                a = X;
            }else{
                b = Y;
            }
        }
        System.out.println(a * b);
    }
}