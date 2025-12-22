import java.util.*;
import java.util.function.IntBinaryOperator;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;
    static int total = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int s = sc.nextInt();

        number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            combi(0, i, new ArrayList<>(), s);
        }
        System.out.println(total);
    }

    static void combi(int start, int len, List<Integer> list, int sum) {
        if (len == list.size()) {
            int sum1 = sums(list);
            if(sum1 == sum){
                total++;
            }
            return;
        }
        for (int i = start; i < number.length; i++) {
            list.add(number[i]);
            combi(i + 1, len, list, sum);
            list.remove(list.size() - 1);
        }
    }

    private static int sums(List<Integer> list) {
        int s = 0;
        for (int x : list) {
            s += x;
        }
        return s;
    }
}
