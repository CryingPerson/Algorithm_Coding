import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int N, M, L, R, X;
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

        N = sc.nextInt(); M = sc.nextInt();

        // [0,0,0,0]

        List<int[]> list = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < N; i++) {
            int k = sc.nextInt();
            int[] arr = new int[1001];
            for (int j = 0; j < k; j++) {
                int start = sc.nextInt(); int end = sc.nextInt();
                max = Math.max(max, end);
                for (int s = start; s < end; s++) {
                    arr[s] = 1;
                }
            }
            list.add(arr);
        }
        int minStart = -1;
        int maxCount = -1;
        for (int i = 0; i <= max - M; i++) {
            int count = 0;
            for (int[] ss : list) {
                for (int j = i; j < i + M; j++) {
                    if(ss[j] == 1) count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                minStart = i;
            }
        }
        System.out.println(minStart + " " + (minStart + M));
    }
}