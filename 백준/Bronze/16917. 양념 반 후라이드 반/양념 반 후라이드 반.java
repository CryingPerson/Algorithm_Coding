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

        int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt(); int x = sc.nextInt(); int y = sc.nextInt();

        int min = Integer.MAX_VALUE;

        min = Math.min(min, A * x + B * y);
        min = Math.min(min, 2 * C * Math.max(x,y));

        int remain = Math.min(x,y) * 2 * C;

        int remianX = x - Math.min(x,y);
        int remianY = y - Math.min(x,y);

        if (x > y) {
            remain += remianX * A;
        }else{
            remain += remianY * B;
        }
        System.out.println(Math.min(remain, min));
    }
}