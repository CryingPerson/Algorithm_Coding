import java.util.*;

class Main {
    static String[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
            sb.append(map.getOrDefault(sc.nextInt(), 0)).append(" ");
        }
        System.out.println(sb);
    }
}