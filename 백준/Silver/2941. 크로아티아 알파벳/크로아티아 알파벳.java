
import java.awt.*;
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> list;
    static int m;
    static int n;
    static int[][] board;
    static int[][] dis;
    static int[] answer;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] ans;
    static int zero = 0;
    static int[] arrs;
    static int one = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String s = kb.nextLine();

        String s1 = s.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ");
        System.out.println(s1.length());
    }
}

