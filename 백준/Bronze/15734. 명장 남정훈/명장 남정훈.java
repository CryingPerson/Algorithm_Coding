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

        int l = sc.nextInt(); int r = sc.nextInt(); int a = sc.nextInt();

        int min = Math.min(l, r);

        while (true) {
            if (l != r && a != 0) {
                if(l == min){
                    l++;
                }else if(r == min){
                    r++;
                }
                min++;
                a--;
            } else if (l == r && a > 1) {
                l++; r++;
                a -= 2;
            }else{
                break;
            }
        }
        int ans = Math.min(l, r);
        System.out.println(ans * 2);
    }
}
