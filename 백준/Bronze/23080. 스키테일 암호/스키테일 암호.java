import javax.swing.plaf.ButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0}; // 북 동 남 서
    static int[] dy = {0, 1, 0, -1};
    static int cleaned = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while (pos < s.length()) {
            sb.append(s.charAt(pos));
            pos += n;
        }
        System.out.println(sb);
    }
}
