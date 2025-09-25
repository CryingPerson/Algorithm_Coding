import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0; int b = 0;
        for (int i = 0; i < n; i++) {
            int sdwdads = sc.nextInt(); int adfsaegfaef = sc.nextInt();
            if(sdwdads > adfsaegfaef) a++;
            else if(sdwdads < adfsaegfaef) b++;
        }
        System.out.println(a + " " + b);
    }
}