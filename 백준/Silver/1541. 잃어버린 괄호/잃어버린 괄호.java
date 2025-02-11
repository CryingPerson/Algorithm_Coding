

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static Queue<point> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] pre = s.split("-");

        String[] stt = pre[0].split("\\+");
        int sum = 0;
        for (int i = 0; i < stt.length; i++) {
            sum += Integer.parseInt(stt[i]);
        }

        int minus = 0;
        for (int i = 1; i < pre.length; i++) {
            minus = 0;
            String[] st = pre[i].split("\\+");
            for (int j = 0; j < st.length; j++) {
                minus += Integer.parseInt(st[j]);
            }
            sum -= minus;
        }
        System.out.println(sum);
    }
}

class point {
    int x;
    int y;

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
