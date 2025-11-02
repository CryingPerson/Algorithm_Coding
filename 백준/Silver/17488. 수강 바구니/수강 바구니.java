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

        int n = sc.nextInt(); int m = sc.nextInt();

        int[] subject = new int[m];

        for(int i = 0; i < m; i++) subject[i] = sc.nextInt();

        boolean[][] person = new boolean[n][m];
        boolean[][] possibe = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            while (true) {
                int num = sc.nextInt();
                if(num == -1) break;

                if(subject[num - 1] > 0){
                    subject[num - 1]--;
                    possibe[i][num-1] = true;
                }else if(subject[num - 1] <= 0){
                    rollback(possibe, num - 1);
                }
            }
        }
        for (int i = 0; i < possibe.length; i++) {
            for (int j = 0; j < possibe[0].length; j++) {
                if(possibe[i][j]){
                    person[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            while (true) {
                int num = sc.nextInt();
                if(num == -1) break;

                if(subject[num - 1] > 0){
                    subject[num - 1]--;
                    possibe[i][num-1] = true;
                }else if(subject[num - 1] <= 0){
                    rollback(possibe, num - 1);
                }
            }
        }

        for (int i = 0; i < possibe.length; i++) {
            for (int j = 0; j < possibe[0].length; j++) {
                if(possibe[i][j]){
                    person[i][j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if(person[i][j]){
                    ok = false;
                    sb.append(j + 1).append(" ");
                }
            }
            if(ok){
                sb.append("망했어요").append("\n");
            }else sb.append("\n");
        }
        System.out.println(sb);


    }
    static void rollback(boolean[][] p, int n) {
        for (int i = 0; i < p.length; i++) {
            p[i][n] = false;
        }
    }
}
