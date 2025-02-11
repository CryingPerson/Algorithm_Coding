

import java.util.*;

class Main {
    static int[] dx = {-1, 0, 1, 0}; //
    static ArrayList<ArrayList<Integer>> list;
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static Queue<point> queue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.next();
            if(s.equals("0"))return;

            boolean equals = s.equals(new StringBuilder(s).reverse().toString());
            if(equals) System.out.println("yes");
            else System.out.println("no");
        }
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
