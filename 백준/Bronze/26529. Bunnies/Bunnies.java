import javax.swing.plaf.ButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0}; // 북 동 남 서
    static int[] dy = {0, 1, 0, -1};
    static int cleaned = 0;

    static int[] num = {10, 8, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            int[] meori = new int[num + 2];
            int ans = fibo(num + 1, meori);
            System.out.println(ans);
        }
    }

    static int fibo(int num, int[] mm) {
        if(num == 0) return 0;
        if(num == 1) return 1;

        if(mm[num] != 0) return mm[num];

        return mm[num] = fibo(num - 1, mm) + fibo(num  - 2, mm);
    }
}
