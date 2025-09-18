import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <= list.get(list.size() - 1); j++) {
                int sum = 0;
                for (int k = 0; k < list.size() - 1; k++) {
                    sum += list.get(k + 1) - list.get(k);
                }
                sum += Math.abs(list.get(0) - j) + Math.abs(list.get(list.size() -1) - j);
                min = Math.min(sum, min);
            }
            System.out.println(min);

        }
    }
}
