import java.util.*;
class Main {
    static int[] dx = {-1, 0 ,1 , 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int[] arr = new int[n];

        int idx = 0;
        for(int i = 1; i <=n; i++) arr[idx++] = i;

        for (int i = 0; i < m; i++) {
            int begin = sc.nextInt() - 1; int end = sc.nextInt() - 1; int mid = sc.nextInt() - 1;

            int idxx = begin;
            // 1 2 3 4 5 6
            // 4 5 6 1 2 3

            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int j = mid; j <= end; j++) {
                arr[idxx++] = temp[j];
            }
            for (int j = begin; j <= mid - 1; j++) {
                arr[idxx++] = temp[j];
            }
        }

        for(int x : arr) System.out.print(x + " ");
    }
}