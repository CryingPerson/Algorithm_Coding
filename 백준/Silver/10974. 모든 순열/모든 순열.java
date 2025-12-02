import java.io.*;
import java.util.*;

public class Main {
    static boolean[] used = new boolean[10];

    static boolean[] visted;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        visted = new boolean[n];
        int[] arr = new int[n];
        dfs(n, arr, 0);


        System.out.println(sb);
    }

    static void dfs(int n, int[] arr, int depth) {
        if (depth == n) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append('\n');
        }else{
            for (int i = 0; i < n; i++) {
                if(!visted[i]){
                    visted[i] = true;
                    arr[depth] = i + 1;
                    dfs(n, arr, depth + 1);
                    visted[i] = false;
                }
            }
        }
    }
}
