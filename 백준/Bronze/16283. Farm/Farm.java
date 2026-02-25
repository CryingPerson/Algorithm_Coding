import java.util.*;

public class Main {
    static int n, m;
    static boolean[] isBroken = new boolean[10];
    static int minTotalPress = Integer.MIN_VALUE;

    static int[][] board;
    static List<int[]> chicken;
    static List<int[]> home;
    static List<List<Integer>> list;
    static int[] dx = {-1 , 0 , 1, 0};
    static int[] dy = {0, 1, 0 , -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); int b = sc.nextInt(); int n = sc.nextInt(); int total = sc.nextInt();

        int count = 0;

        List<int[]> list1 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if(i + j == n){
                    int num = a * i + j * b;
                    if (num== total) {
                        count++;
                        list1.add(new int[]{i , j});
                    }
                }
            }
        }

        if(count > 1 || count == 0){
            System.out.println(-1);
        }else System.out.println(list1.get(0)[0] + " " + list1.get(0)[1]);
    }
}