import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 120

        // 1 * (1 * 10 - 1)
        // 2 * (10 * 10 - 1)

        long start = 1;
        int digit = 1;

        long result = 0;
        while (start <= n) {
            long end = Math.min(n, start * 10 -1);

            result += (end - start + 1) * digit;
            result %= 1234567;

            digit++;
            start *= 10;
        }

        System.out.println(result);
    }
}
