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

    static int[] num = {10, 8, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String end = "Was it a cat I saw?";
        int idx = 2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if(end.equals(line)) break;

            for(int i = 0; i < line.length(); i += idx){
                sb.append(line.charAt(i));
            }

            sb.append('\n');
            idx++;
        }
        System.out.println(sb);
    }
}