import java.nio.IntBuffer;
import java.util.*;

public class Main {
    static int[][] ans;
    static int idx = 0;
    static int max = Integer.MAX_VALUE;
    static int x = Integer.MAX_VALUE;
    static int y = 0;
    static boolean[] check;
    static List<int[]> list3;
    static Set<String> set = new HashSet<>();
    static String[][] ch = {{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
            {"a", "s", "d", "f", "g", "h", "j", "k", "l", " "},
            {"z", "x", "c", "v", "b", "n", "m", " ", " ", " "}};
    static char first = 'R';


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        list3 = new ArrayList<>();
        check = new boolean[n];
        idx = k;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{sc.nextInt(), sc.nextInt()});
        }

        for (int i = 0; i < list.size(); i++) {
            DFS(list, k, 0);
        }
        System.out.println(x);
    }

    static void DFS(List<int[]> list, int k, int L) {
        if(L == k){
            int reseach = reseach(list);
            x = Math.min(reseach, x);
        }
        for (int i = 0; i < list.size(); i++) {
            if(!check[i]){
                check[i] = true;
                list3.add(list.get(i));
                DFS(list, k, L+1);
                list3.remove(list3.size() - 1);
                check[i] = false;
            }
        }
    }

    static int reseach(List<int[]> list) {
        int max = 0;
        for (int[] li : list) {
            int dis = Integer.MAX_VALUE;
            int x = li[0];
            int y = li[1];

            for (int[] ll : list3) {
                int num = Math.abs(x - ll[0]) + Math.abs(y - ll[1]);
                dis = Math.min(dis, num);
            }
            max = Math.max(max, dis);
        }
        return max;
    }
}

