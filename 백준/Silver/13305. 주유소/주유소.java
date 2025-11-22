import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[][] visited;
    static List<int[]> point = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] carL = new int[n];
        int[] dis = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            dis[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            carL[i] = sc.nextInt();
        }

        int min = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if(i >= dis.length) continue;
            total += (long) carL[i] * dis[i];

            while ((i + 1) < n && (i + 1) < dis.length && carL[i + 1] > carL[min]) {
                total += (long) carL[min] * dis[i + 1];
                i++;
            }
            min = i + 1;
        }
        System.out.println(total);


    }
}
