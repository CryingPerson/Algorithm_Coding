import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.DoubleConsumer;

public class Main {
    static int[] arr = new int[3];
    static int x,y,z;
    static int[][][] tomato;
    static boolean[] use;
    static int[][] board;
    static List<int[]> point = new LinkedList<>();
    static List<int[]> avoidHome = new LinkedList<>();
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static long max = Integer.MIN_VALUE;
    static int k;
    static List<int[]> list;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();
        int[] nodes = new int[n];

        int temp = k;
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        int[] nodes2 = new int[n - k + 1];
        for (int i = 0; i < nodes2.length; i++) {
            nodes2[i] = nodes[k - 1];
            k++;
        }
        k = temp;


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(num < n){
                sb.append(nodes[num]).append("\n");
            }else{
                sb.append(nodes2[(num - (k - 1)) % (n - (k - 1))]).append("\n");
            }
        }
        System.out.println(sb);
    }
}

