import java.io.*;
import java.util.*;

public class Main {
    static boolean[] used = new boolean[10];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1000001];

        int idx = 1;

        for (int i = 1; idx <= 1000000; i++) {
            if(check(i)){
                arr[idx++] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            sb.append(arr[n]).append("\n");
        }
        System.out.println(sb);
    }

    static boolean check(int i) {


        Arrays.fill(used, false);
        while (i > 0) {
            int d = i % 10;
            if (used[d]) {
                return false;
            }
            used[d] = true;
            i /= 10;
        }
        return true;
    }
}
