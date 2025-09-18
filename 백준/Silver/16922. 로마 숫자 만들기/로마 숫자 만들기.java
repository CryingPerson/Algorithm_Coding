import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean active = true;
    static int[] dx = {0, 1, 0 ,- 1};
    static int[] dy = {1, 0, -1, 0};
    static int[] romas = {1,5,10,50};
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] save = new int[n];
        DFS(n, 0, save, 0);
        System.out.println(set.size());
    }

    static void DFS(int n, int depth, int[] sa, int start) {
        if (depth == n) {
            int check = check(sa);
            set.add(check);
        }else{
            for (int i = start; i < 4; i++) {
                sa[depth] = i;
                DFS(n, depth + 1, sa, i);
            }
        }
    }

    static int check(int[] chars) {
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += romas[chars[i]];
        }
        return sum;
    }
}
