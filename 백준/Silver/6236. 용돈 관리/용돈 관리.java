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

        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        search(arr, max, m);

        System.out.println(min);

    }

    static void search(int[] arr, int Mo, int total) {
        int left = 1;
        int right = Integer.MAX_VALUE -3;

        while (left <= right) {

            int mid = (left + right) / 2;

            int cur = 0;

            if(mid < Mo){
                left = mid + 1;
                continue;
            }
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                int require = arr[i];

                if (cur < require) {
                    cur = mid - require;
                    cnt++;
                } else if (cur >= require) {
                    cur -= require;
                }
            }
            if (cnt <= total) {
                min = Math.min(min, mid);
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
    }
}
