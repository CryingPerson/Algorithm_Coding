import java.io.IOException;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    static int[] rank = {1,2,3,4,5,6};
    static int[] rank2 = {1,2,4,8,16};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] money = {5000000, 3000000, 2000000, 500000, 300000, 100000};
        int[] money2 = {5120000, 2560000, 1280000, 640000, 320000};
        for (int i = 0; i < n; i++) {
            int first = sc.nextInt(); int second = sc.nextInt();

            int sum = 0;
            for (int j = 0; j < rank.length; j++) {
                if(first == 0) break;
                first -= rank[j];
                if(first == 0 || first < 0){
                    sum += money[j];
                    break;
                }
            }


            for (int j = 0; j < rank2.length; j++) {
                if(second == 0) break;
                second -= rank2[j];
                if(second == 0 || second < 0){
                    sum += money2[j];
                    break;
                }
            }
            System.out.println(sum);
        }

    }
}
