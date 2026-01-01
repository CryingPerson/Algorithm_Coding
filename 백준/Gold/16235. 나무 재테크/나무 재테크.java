import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static int[][] add;
    static int[][] dist;
    static final int INF = 1_000_000;
    static final int[] dx = {-1, -1, 0 ,1, 1, 1, 0, -1};
    static final int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int min = Integer.MAX_VALUE;
    static boolean[][] visited;
    static List<int[]> list = new ArrayList<>();
    static int[] require;
    static boolean[] robot;
    static ArrayDeque<Integer>[][] tree;

    static int[][] save;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        int min = Math.min(n,m);

        add = new int[n][n];
        save = new int[n][n];
        tree = new ArrayDeque[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tree[i][j] = new ArrayDeque<>();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                add[i][j] = sc.nextInt();
                save[i][j] = 5;
            }
        }
        for (int i = 0; i < m; i++) {
            tree[sc.nextInt() - 1][sc.nextInt() - 1].add(sc.nextInt());
        }


        for (int i = 0; i < k; i++) {

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {

                    if(tree[a][b].isEmpty()) continue;

                    int total = 0;

                    int size = tree[a][b].size();
                    for (int j = 0; j < size; j++) {
                        int cur = tree[a][b].pollFirst();

                        if(cur <= save[a][b]){
                            save[a][b] -= cur;
                            tree[a][b].addLast( cur + 1);
                        }else{
                            total += (cur / 2);
                        }
                    }
                    save[a][b] += total;

                }
            }

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if(tree[a][b].isEmpty()) continue;

                    for(int num : tree[a][b]){
                        if (num % 5 == 0) {
                            for (int j = 0; j < 8; j++) {
                                int nx = a + dx[j];
                                int ny = b + dy[j];

                                if(nx < 0 || ny < 0 || nx >=n || ny >=n) continue;

                                tree[nx][ny].addFirst(1);

                            }
                        }
                    }
                }
            }

            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    save[a][b] += add[a][b];
                }
            }

        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(tree[i][j].isEmpty()) continue;

                cnt += tree[i][j].size();
            }
        }

        System.out.println(cnt);
    }
}
