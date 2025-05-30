import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static char[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int N = Integer.parseInt(br.readLine());
        int minus = (int)Math.round(N * 0.15);
        if(N == 0) {
            System.out.println(0);
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());
            list.add(m);
        }
        Collections.sort(list);
        List<Integer> list1 = list.subList(minus, list.size() - minus);
        double asDouble = list1.stream().mapToInt(i -> i).average().getAsDouble();
        System.out.println(Math.round(asDouble));
    }
}
