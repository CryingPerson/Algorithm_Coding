import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[91];
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        long fibo = fibo(n);
        System.out.println(fibo);

    }
    public static long fibo(int n) {
        if(n == 2) return 1;
        if(n == 1 || n == 0) return 1;

        if(save[n] != 0) return save[n];
        return save[n] = fibo(n - 1) + fibo(n- 2);
    }
}
