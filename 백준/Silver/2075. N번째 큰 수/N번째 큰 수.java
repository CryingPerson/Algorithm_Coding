import java.util.*;

public class Main {
    static int n;
    static int[][] board;

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        board = new int[n][n];

        int[] arr = new int[n * n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[pos] = sc.nextInt();
                pos++;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length - n]);
    }
}
