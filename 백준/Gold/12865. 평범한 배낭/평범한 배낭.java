

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt(); int m = kb.nextInt();

        int[]dp = new int[m+1];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int weigh = kb.nextInt();
            int value = kb.nextInt();
            for (int j = m; j >= weigh; j--) {
                dp[j] = Math.max(dp[j], dp[j - weigh] + value);
                answer = Math.max(answer, dp[j]);
            }
        }
        System.out.println(answer);
    }

}
