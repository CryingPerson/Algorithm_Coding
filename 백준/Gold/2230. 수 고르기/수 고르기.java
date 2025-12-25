import java.util.*;

public class Main {
    static int n;
    static int[][] board;

    static int count = 0;

    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 1;

            while (left < n && right < n) {
                int num = Math.abs(arr[left] - arr[right]);

                if (num < m) {
                    right++;
                } else if (num >= m) {
                    left++;
                    min = Math.min(min, num);
                }
            }

        System.out.println(min);
    }
}
