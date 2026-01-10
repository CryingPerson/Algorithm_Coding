import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    static int n,m,l;
    static int[][] a;
    static int up = -1, down = -1;

    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};



    static char[] answer = {'3', '4', '5'};
    static int[] arr;
    static int max = 0;
    static boolean[] vi;
    static boolean ends= false;
    static boolean poss = false;
    static int[] cur;
    static int cn = 0;
    static char[][] board;
    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> list = new ArrayList<>();
    static List<Integer> possbile;
    static Set<Integer> set = new HashSet<>();
    static int[] kit;
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        kit = new int[n];
        vi = new boolean[n];

        for (int i = 0; i < n; i++) {
            kit[i] = sc.nextInt();
        }
        dfs(0,new int[n]);

        System.out.println(cn);

    }

    static void dfs(int depth, int[] arr) {
        if(depth == n){
            boolean chs = check(arr);

            if(chs){
                cn++;
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(!vi[i]){
                    arr[depth] = i;
                    vi[i] = true;
                    dfs(depth + 1, arr);
                    vi[i] = false;
                }
            }
        }
    }

    static boolean check(int[] arr) {
        int cur = 500;

        for (int i = 0; i < arr.length; i++) {
            cur += kit[arr[i]];
            cur -= m;

            if(cur < 500) return false;
        }

        return true;
    }
}
