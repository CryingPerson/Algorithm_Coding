

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static  ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] preSum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i-1] = sc.nextInt();
            preSum[i] = arr[i-1] + preSum[i-1];
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();


            int sum = 0;

            sum = preSum[b] - preSum[a-1];
            System.out.println(sum);
        }
    }
}
