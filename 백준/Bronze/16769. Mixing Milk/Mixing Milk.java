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

        int a = sc.nextInt(); int afirst = sc.nextInt();
        int b = sc.nextInt(); int bfirst = sc.nextInt();
        int c = sc.nextInt(); int cfirst = sc.nextInt();

        int[] arr = new int[3];
        int[] possibe = new int[3];
        possibe[0] = a; possibe[1] = b; possibe[2] = c;
        arr[0] = afirst; arr[1] = bfirst; arr[2] = cfirst;
        List<String> set = new ArrayList<>();


        boolean ok = false;
        while (true) {
            if(ok) break;
            for (int i = 0; i < 3; i++) {
                if(arr[i] >= possibe[(i + 1) % 3] - arr[(i + 1) % 3]){
                    arr[i] -= possibe[(i + 1) % 3] - arr[(i + 1) % 3];
                    arr[(i + 1) % 3] += possibe[(i + 1) % 3] - arr[(i + 1) % 3];
                }else{
                    arr[(i + 1) % 3] += arr[i];
                    arr[i] = 0;
                }
                String ans = "";
                for (int j = 0; j < 2; j++) {
                    ans += arr[j] + ",";
                }
                ans += arr[2];
                set.add(ans);
                if(set.size() == 100) {
                    ok = true;
                    break;
                }
            }
        }
        for(String s : set.get(set.size() - 1).split(",")){
            System.out.println(s);
        }
    }
}