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

        int n = sc.nextInt();

        int pre = -1;
        int first = 2;
        int useTotal = 0;
        for (int i = 0; i < n; i++) {
            int use = sc.nextInt();

            if(use == pre){
                first *= 2;
            }else{
                first = 2;
            }
            pre = use;
            if(useTotal + first >= 100){
                useTotal = 0;
                pre = -1;
                continue;
            }
            useTotal += first;
        }
        System.out.println(useTotal);
    }
}
