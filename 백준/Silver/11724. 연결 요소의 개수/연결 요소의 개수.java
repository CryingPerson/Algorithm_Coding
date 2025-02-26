import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> list1;
    static int n, m;
    static int[][] board;
    static int MaxSave = -1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int area = -1;
    static int[] ch;
    static int[] paraent;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        list1 = new ArrayList<>();
         int n = sc.nextInt();
         int m = sc.nextInt();
        ch = new int[n+1];
        for (int i = 0; i <= n; i++) {
            list1.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list1.get(a).add(b);
            list1.get(b).add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if(ch[i] == 0){
                ans++;
                DFS(i);
            }
        }
        System.out.println(ans);
    }

    public static void DFS(int node) {
        ch[node] = 1;
        for (int x : list1.get(node)) {
            if(ch[x] == 0){
                ch[x] = 1;
                DFS(x);
            }
        }
    }
}

