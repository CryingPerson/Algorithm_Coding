
import java.text.NumberFormat;
import java.util.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) list.add(i);

        while (list.size() != 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    temp.add(list.get(i));
                }
            }
            for (int x : temp) {
                list.remove(Integer.valueOf(x));
            }
        }
        for(int x : list) System.out.println(x);

    }
}