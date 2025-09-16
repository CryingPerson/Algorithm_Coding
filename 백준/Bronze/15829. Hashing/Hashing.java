import java.math.BigInteger;
import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] cx = {-1, -1, 1, 1};
    static int[] cy = {-1, 1, 1, -1};
    static boolean[] visited;
    static int cnt = 0;
    static int dir;
    static int x;
    static int y;
    static boolean[][] snake;
    static boolean[][] temp;
    static int[][] board;

    public static int roomMax;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        long count = 0;

        int n = sc.nextInt();

        BigInteger bigInteger = new BigInteger("31");

        BigInteger sum = new BigInteger("0");
        BigInteger bigInteger1 = new BigInteger("1234567891");
        sc.nextLine();
        String s= sc.nextLine();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            int num = c - 'a' + 1;

            BigInteger i1 = new BigInteger(String.valueOf(num));

            BigInteger multiply = i1.multiply(bigInteger.pow(i));

            sum = sum.add(multiply).mod(bigInteger1);
        }
        System.out.println(sum);

    }
}
