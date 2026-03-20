import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    static String s;
    static int[] arr;
    static int n, m, x, y;
    static boolean[] visited;

    static Set<Integer> ans = new HashSet<>();
    static int[] dist;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] home;
    static int[][] board;
    static int[] belt;
    static List<List<node>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String s = sc.nextLine();
            if(s.equals("#")) break;
            char[] alpabet = new char[26];
            int cnt = 0;
            s = s.toLowerCase();
            for (char c : s.toCharArray()) {
                if(Character.isAlphabetic(c)) alpabet[c - 'a']++;
            }
            for(int cc : alpabet) if(cc != 0) cnt++;

            System.out.println(cnt);
        }
    }

}
class node{
    int to;
    int cost;

    public node(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}
