import java.util.*;

public class Main {
    static int a1 = 0;
    static int b1 = 0;
    static boolean[][] booleans;
    static boolean active = true;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cnt = 0;
    static int dir;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();

        int p = -1;
        List<Integer> list = new ArrayList<>();

        cnt = 0;
        for(int i = 2; i <=n; i++) list.add(i);
        for (int i = 2; i <= n; i++) {
            if(!list.isEmpty() && isPirme(i)){
                p = i;
                cnt++;
                list.remove((Integer) p);
                if(cnt == k){
                    System.out.println(p);
                    return;
                }else{
                    remove(p, list, k);
                }
            }
        }
    }

    static void remove(int n, List<Integer> list, int k) {
        for (int i = 0; i < list.size(); i++) {
            Integer i1 = list.get(i);
            if(i1 % n == 0){
                cnt++;
                if (cnt == k) {
                    System.out.println(i1);
                    return;
                }
                list.remove(i1);
            }
        }
    }

    static boolean isPirme(int cnt) {
        if(cnt < 2) return false;

        for (int i = 2; i * i <= cnt; i++) {
            if(cnt % i == 0) return false;
        }

        return true;
    }
}
