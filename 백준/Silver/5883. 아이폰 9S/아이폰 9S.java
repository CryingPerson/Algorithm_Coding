import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 2 7 3 7 7 3 7 5 7
        // 2 7 7 7 7 5 7
        //
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int B = sc.nextInt();
            list.add(B);
            set.add(B);
        }

        int max = -1;
        Iterator<Integer> iterator = set.iterator();
        for (int a = 0; a < set.size(); a++) {
            int nn = iterator.next();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (list.get(i) == nn) continue;
                temp.add(list.get(i));
            }

            int left = 0;
            for (int right = 0; right < temp.size(); right++) {
                if (Objects.equals(temp.get(left), temp.get(right))) {
                    max = Math.max(max, right - left + 1);
                } else {
                    left = right;
                }
            }
        }
        System.out.println(max);

    }
}
