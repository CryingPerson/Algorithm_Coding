import java.util.*;

public class Main {
    static int[] dx = {0, -1, 0, 1}; // ← ↑ → ↓
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += sc.nextInt();
        }

        int sum2 = 0;
        for (int i = 0; i < m; i++) {
            sum2 += sc.nextInt();
        }

        System.out.println(sum1 - sum2);
    }
}
