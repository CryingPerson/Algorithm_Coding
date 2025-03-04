import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int n;
    public static int[] ch;
    public static char[][] color;
    public static char[][] color2;
    public static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        boolean[] flag = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            int sum = i;
            int num = i;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum <= 10000){
                flag[sum] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if(!flag[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
