import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m =sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            arr[a - 1]++; arr[b - 1]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int x : arr) sb.append(x).append("\n");
        System.out.println(sb);
    }
}