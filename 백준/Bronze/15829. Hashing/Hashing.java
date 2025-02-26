import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list1;
    static int n, m;
    static int[][] board;
    static int MaxSave = -1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        long result = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int num = ch - 'a' + 1;
            result += (long) num * (int)Math.pow(31, i);
        }
        System.out.println(result);
    }
}

