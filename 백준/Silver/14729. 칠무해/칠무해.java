import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static boolean[][] board;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] list = new double[n];


        for (int i = 0; i < n; i++) {
            list[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(list);

        for (int i = 0; i < 7; i++) {
            System.out.printf("%.3f%n", list[i]);
        }
    }
}