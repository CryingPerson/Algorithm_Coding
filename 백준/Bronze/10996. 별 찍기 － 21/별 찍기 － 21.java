import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean[][] booleans;
    static boolean active = true;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;
    static int dir;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n * 2; i++) {
            char c = ' ';
            if (i % 2 == 0) {
                c = '*';
            }
            for (int j = 0; j < n; j++) {
                System.out.print(c);
                if(c == '*'){
                    c = ' ';
                }else c = '*';
            }
            System.out.println();
        }
    }
}
