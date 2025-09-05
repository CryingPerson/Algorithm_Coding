import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int idx = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
            }
        }

        int total = 0;
        for (int i = n; i <= m; i++) {
            total += list.get(i - 1);
        }

        System.out.println(total);
    }
}
