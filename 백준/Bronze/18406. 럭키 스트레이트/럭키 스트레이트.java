
import java.text.NumberFormat;
import java.util.*;

class Main {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] snake;
    static int[][] board;
    static char[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String a1 = line.substring(0, line.length() / 2);
        String b1 = line.substring(line.length() / 2);

        int total = 0; int total2 = 0;

        for(char c : a1.toCharArray()){
            total += c - '0';
        }
        for (char c : b1.toCharArray()) {
            total2 += c - '0';
        }

        String ans = total == total2 ? "LUCKY" : "READY";

        System.out.println(ans);
    }
}