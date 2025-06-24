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

        int first = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        first = arr[0];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i] - first, max);
            first = Math.min(first, arr[i]);
        }
        if(max < 0){
            System.out.println(0);
        }else{
            System.out.println(max);
        }
    }
}

