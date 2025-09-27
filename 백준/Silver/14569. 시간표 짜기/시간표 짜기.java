import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<info> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                int time = sc.nextInt();
                temp.add(time);
            }
            list.add(new info(temp));
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < k; j++) {
                int ti = sc.nextInt();
                set.add(ti);
            }
            int count = 0;
            for (info in : list) {
                boolean ok = true;
                for (int x : in.list) {
                    if (!set.contains(x)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
class info{
    List<Integer> list;

    public info(List<Integer> list) {
        this.list = list;
    }
}