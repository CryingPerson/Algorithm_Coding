
import java.awt.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] arr = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + kb.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            int x1 = kb.nextInt();
            int y1 = kb.nextInt();
            int x2 = kb.nextInt();
            int y2 = kb.nextInt();

            int result = arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];

            System.out.println(result);
        }
    }

}

