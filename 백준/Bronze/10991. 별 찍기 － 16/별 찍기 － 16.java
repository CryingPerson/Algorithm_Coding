import java.io.IOException;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    static int[] rank = {1,2,3,4,5,6};
    static int[] rank2 = {1,2,4,8,16};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
