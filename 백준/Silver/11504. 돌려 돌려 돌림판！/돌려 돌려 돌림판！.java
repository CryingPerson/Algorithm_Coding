import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(); int m = sc.nextInt();
            sc.nextLine();

            String x = "";
            String[] numbers = sc.nextLine().split(" ");
            for(String s : numbers) x += s;
            int xx = Integer.parseInt(x);

            String y = "";

            String[] numberss = sc.nextLine().split(" ");
            for(String s : numberss) y += s;
            int yy = Integer.parseInt(y);

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int count = count(arr, xx, yy, m);
            System.out.println(count);

        }
    }

    static int count(int[] arr, int x, int y, int m) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            String a ="";
            for (int j = i; j < i + m; j++) {
                a += arr[j % arr.length];
            }
            sum = Integer.parseInt(a);
            if(x <= sum && y >= sum) cnt++;
        }
        return cnt;
    }
}