import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static int row;
    public static int[][] board;
    public static int col;
    public static int[] ch;
    public static int MinL = Integer.MAX_VALUE;
    public static int cnt = 1;
    public static int maxSize = 9999;
    public static int m;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int a;
    public static int b;
    public static int n;
    public static boolean[][] check;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String s1 = kb.next();

        String s2 = kb.next();

        int n = reverse(s1,s2);
        int ans = reverse(n);

        System.out.println(ans);
    }
    public static int reverse(String s1, String s2) {
        int a = Integer.parseInt(new StringBuffer(s1).reverse().toString());
        int b = Integer.parseInt(new StringBuffer(s2).reverse().toString());

        return a + b;
    }

    public static int reverse(int an){
        String string = new StringBuilder(String.valueOf(an)).reverse().toString();

        int i = Integer.parseInt(string);
        

        return i;
    }
}
