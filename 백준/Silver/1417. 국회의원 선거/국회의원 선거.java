import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int dasom = 0;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                dasom = sc.nextInt();
            }else pQ.add(sc.nextInt());
        }
        int bug = 0;
        while (!pQ.isEmpty()) {
            int top = pQ.poll();
            if(top >= dasom){
                top--;
                bug++;
                dasom++;
                pQ.add(top);
            }else{
                break;
            }
        }
        System.out.println(bug);
    }
}