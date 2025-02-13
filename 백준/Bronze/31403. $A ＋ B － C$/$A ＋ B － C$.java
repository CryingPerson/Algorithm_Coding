import java.util.Scanner;

public class Main {
    static int[][] board;
    static int blue = 0;
    static int white = 0;
    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(n + m - c);
        String s = String.valueOf(n);
        String s2 = String.valueOf(m);

        String s3 = s + s2;

        System.out.println(Integer.parseInt(s3) - c);
    }
}
