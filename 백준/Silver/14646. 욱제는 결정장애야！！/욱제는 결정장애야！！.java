
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

        int[] stiker = new int[2 * n];

        int max= - 1;
        for (int i = 0; i < 2 * n; i++) {
            stiker[i] = sc.nextInt();
        }

        int cnt = 1;
        Set<Integer> set = new HashSet<>();
        set.add(stiker[0]);
        for (int i = 0; i < stiker.length - 1; i++) {
            if(stiker[i] != stiker[i + 1] && !set.contains(stiker[i + 1])){
                cnt++;
                set.add(stiker[i + 1]);
            }else cnt --;
            max = Math.max(cnt,max);
        }
        System.out.println(max);
    }
}