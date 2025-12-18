import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] arr = new int[5];

            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            int sum = 0;

            boolean diff = false;

            if(arr[3] - arr[1] >= 4) diff = true;
            for (int j = 0; j < 5; j++) {
                if(j == 0 || j == 4) continue;
                sum += arr[j];
            }

            System.out.println(diff ? "KIN" : sum);

        }
    }
}
