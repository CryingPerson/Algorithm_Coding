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

        int[] arr = new int[n];

        int m = sc.nextInt();

        int[] target = new int[m];
        for (int i = 0; i < m; i++) {
            target[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int targe = target[i];
            for (int j = 0; j < n; j++) {
                int select = sc.nextInt();
                if(targe == select){
                    arr[j] ++;
                } else if (targe != select) {
                    arr[targe - 1]++;
                }
            }
        }
        for(int x : arr) System.out.println(x);

    }
}
