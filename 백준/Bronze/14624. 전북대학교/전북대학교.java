import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int len = n / 2;
        star = new char[len + 2][n];

        if (n % 2 == 0) {
            System.out.println("I LOVE CBNU");
            return;
        }
        for (int i = 0; i < len + 2; i++) {
            Arrays.fill(star[i],' ');
        }
        for (int i = 0; i < n; i++) {
            star[0][i] = '*';
        }

        star[1][len] = '*';
        int idx = 1;
        for (int i = 2; i < len + 2; i++) {
            star[i][len - idx] = '*';
            star[i][len + idx] = '*';
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len + 2; i++) {
            int last = n - 1;

            while (last >= 0 && star[i][last] == ' ') last--;
            for (int j = 0; j <= last; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

    }
}