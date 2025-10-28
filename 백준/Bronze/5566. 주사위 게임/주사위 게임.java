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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int[] cmd = new int[n];

        for(int i = 0; i < n; i++) cmd[i] = sc.nextInt();

        int start = 0;
        int count = 0;
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            count++;
            start += num;

            if(start >= n - 1) {
                System.out.println(count);
                return;
            }
            start += cmd[start];

            if (start >= n - 1) {
                System.out.println(count);
                return;
            }

        }
    }
}
