import java.util.*;

public class Main {
    static int n, m;
    static boolean[] isBroken = new boolean[10];
    static int minTotalPress = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int start = n / 100;
        for (int i = start * 100; i <= start * 100 + 99; i++) {
            if (i % m == 0) {
                int ans = i % 100;
                if (ans < 10) {
                    System.out.println("0"+ans);
                }else System.out.println(i % 100);
                return;
            }
        }
    }
}