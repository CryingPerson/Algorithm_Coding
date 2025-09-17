import java.math.BigInteger;
import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static boolean[] visited;
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] snake;
    static boolean[][] temp;
    static int[][] board;

    static boolean[] cups;
    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt(); int m  =sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int num = sc.nextInt();
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }

            int max = -1;

            for (int key : map.keySet()) {
                if(max < map.get(key)){
                    max = map.get(key);
                }
            }
            List<Integer> list = new ArrayList<>();

            for (int key : map.keySet()) {
                if(max != map.get(key)) list.add(key);
            }

            int max2 = -1;

            for (int ss : list) {
                Integer i1 = map.get(ss);
                if (max2 < i1) {
                    max2 = i1;
                }
            }
            list = new ArrayList<>();

            for (int key : map.keySet()) {
                if(max2 == map.get(key)) list.add(key);
            }
            Collections.sort(list);

            for(int s : list) System.out.print(s + " ");
            System.out.println();
        }
    }
}
