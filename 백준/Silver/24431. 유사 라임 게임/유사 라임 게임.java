import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int N, L, R, X;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = 0;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static Set<String> set = new HashSet<>();
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;

    static int[] problem;
    static List<int[]> start;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt(); int l = sc.nextInt(); int k = sc.nextInt();

            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String comapre = sc.next();
                
                String to = comapre.substring(l - k);
                
                map.put(to, map.getOrDefault(to, 0) + 1);
            }

            int count = 0;
            for (int xx : map.values()) {
                count += xx / 2;
            }

            System.out.println(count);
        }
    }
}