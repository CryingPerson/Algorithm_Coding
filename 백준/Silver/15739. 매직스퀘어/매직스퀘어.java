import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int[] len = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
                len[a]++;
            }
        }

        int num = n * (n * n + 1) / 2;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                sum2 += arr[j][i];
            }
            if (sum != num) {
                System.out.println("FALSE");
                return;
            }
            if (sum2 != num) {
                System.out.println("FALSE");
                return;
            }
        }
        int sum = 0;
        int sun2 = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            sun2 += arr[i][n - i - 1];
        }
        if (sum != num || sun2 != num) {
            System.out.println("FALSE");
            return;
        }
        for (int i = 1; i <= n * n; i++) {
            if (len[i] > 1) {
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
