import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    static String s;
    static int[] arr;
    static int n, m, x, y;
    static boolean[] visited;

    static Set<Integer> ans = new HashSet<>();
    static int[] dist;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] home;
    static int[][] board;
    static int[] belt;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] arr = new int[a];
            int[] arr2 = new int[b];

            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < b; j++) {
                arr2[j] = sc.nextInt();
            }

            Arrays.sort(arr2);

            int count = 0;

            for (int x : arr) {
                int bi = bi(x, arr2);

                count += bi;
            }

            System.out.println(count);
        }
    }

    static int bi(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int idx = 0;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] < target) {
                idx = mid + 1;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return idx;
    }
}