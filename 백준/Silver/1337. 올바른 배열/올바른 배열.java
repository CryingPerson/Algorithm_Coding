import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 오른쪽, 아래
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static char[][] board;
    static boolean[][] checked;
    static int xx;
    static int yy;
    static int[][] ans;
    static int[] alpabet = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            arr[i] = num;
        }
        Arrays.sort(arr);

        int left = 0;

        int answer = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            while (arr[right] - arr[left] >= 5){
                left++;
            }

            int length = right - left + 1;
            answer = Math.min(answer, 5 - length);

        }
        System.out.println(answer);
    }
}

