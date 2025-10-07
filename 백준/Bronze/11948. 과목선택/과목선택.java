import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int x, y;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Map<List<Integer>, Integer> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        Set<Integer> set2 = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < 4; i++) {
            set.add(sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            set2.add(sc.nextInt());
        }

        int sum = 0;
        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i < 3; i++) {
            sum += iterator.next();
        }
        Iterator<Integer> iterator1 = set2.iterator();
        for (int i = 0; i < 1; i++) {
            sum += iterator1.next();
        }
        System.out.println(sum);
    }
}
