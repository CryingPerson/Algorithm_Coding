import java.util.*;

public class Main {

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean end = false;
    static boolean[][] visited;
    static int n, m;
    static int[] weigh;
    static int max = 0;
    static int[] exam;
    static int total = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exam = new int[10];

        for(int i = 0; i < 10; i++) exam[i] = sc.nextInt();

        dfs(0,new int[10]);

        System.out.println(total);
    }

    static void dfs(int idx, int[] cur) {
        if (idx == 10) {
            if(count(cur) >= 5){
                total++;
            }
        }else{
            for (int i = 1; i <= 5; i++) {
                if(idx >= 2 && cur[idx - 2] == i && cur[idx - 1] == i) continue;

                cur[idx] = i;
                dfs(idx + 1, cur);
            }
        }
    }

    static int count(int[] cur) {
        int cnt = 0;

        for (int i = 0; i < cur.length; i++) {
            if(cur[i] == exam[i]) cnt++;
        }

        return cnt;
    }
}
