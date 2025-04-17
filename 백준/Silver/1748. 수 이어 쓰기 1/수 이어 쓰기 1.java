import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;
        int num = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % num == 0){
                num = num * 10;
                cnt++;
            }
            sum += cnt;
        }
        System.out.println(sum);
    }
}
