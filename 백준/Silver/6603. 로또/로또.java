import java.util.*;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Set<String> set = new HashSet<>();
    static StringBuffer sb = new StringBuffer();
    static char[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;
    static int total = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if(num == 0) break;

            int[] arr = new int[num];

            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }


            dfs(0, 6, arr, new int[6], 0);

            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int start, int max, int[] arr, int[] newArr, int depth) {
        if (depth == max) {
            for (int x : newArr) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
        }else{
            for (int i = start; i < arr.length; i++) {
                newArr[depth] = arr[i];
                dfs(i + 1, max, arr, newArr, depth + 1);
            }
        }
    }
}