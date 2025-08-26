import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m =sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int length = map.values().stream().filter(value -> value >= m).mapToInt(i -> i).toArray().length;
        System.out.println(length);
    }
}