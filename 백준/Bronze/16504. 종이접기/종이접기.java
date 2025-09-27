import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
        }
        System.out.println(sum);
    }
}