import java.awt.*;
import java.util.*;
import java.util.List;

class Main {
    public static int n,m;
    public static char[][] board;
    public static int answer = -1;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean[][] visited;
    public static int[][]water;
    public static int bix;
    public static Queue<Point> waterQu = new LinkedList<>();
    public static int biy;
    public static int wax;
    public static int way;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = arr2[i] = kb.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr2);

        int rank  =0 ;
        for (int x : arr2) {
            if(!map.containsKey(x)){
                map.put(x,rank);
                rank++;
            }
        }

        int dex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(arr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
           sb.append(x).append(" ");
        }
        System.out.println(sb);

    }
}
