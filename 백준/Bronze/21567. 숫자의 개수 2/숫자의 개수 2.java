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

        int a = sc.nextInt(); int b = sc.nextInt(); int c= sc.nextInt();

        long sum = 0;

        sum += (long)a * b * c;

        String ans = String.valueOf(sum);

        int[] arr = new int[10];

        for (char cc : ans.toCharArray()) {
            arr[cc - '0']++;
        }

        for(int x : arr) System.out.println(x);

    }
}
