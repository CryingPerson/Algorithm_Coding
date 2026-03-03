import java.util.*;

public class Main {
    static int n, m;
    static boolean[] isBroken = new boolean[10];
    static int minTotalPress = Integer.MAX_VALUE;

    static int[][] board;
    static List<int[]> cheeze;
    static List<int[]> store;
    static List<List<Integer>> list;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int ans = 0;
    static int cnt = 1;
    static boolean[][] visited;
    static int[] sin;
    static int[] sthum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 치는 순서를 정해야함.
        // 2. 경기중에는 정한 순서 변경 불가능
        // 3. 1 ~ 9 번까지 쳤는데 3아웃이 아닐경우
        // 4 이닝은 그대로 유지된상태에서 다시 1번 타자 시작
        // 5. 치는 순서는 이닝이 변경이 되어도 유지되어야함
        // 6. ex ) 2이닝에 6번타자까지 쳤다면 3이닝은 7번부터
        // 7. 가장 좋아하는 선수인 1번선수를 -> 4번 타자로 미리 결정함
        // 8. 이제 다른 선수의 치는 순서를 모두 결정 해야함

        n = sc.nextInt();

        sin = new int[n];
        sthum = new int[n];
        for (int i = 0; i < n; i++) {
            sin[i] = sc.nextInt(); sthum[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            combi(0,0, i, new int[i], new int[i]);
        }

        System.out.println(minTotalPress);

    }

    static void combi(int start, int detph, int max, int[] sins, int[] thn) {
        if (max == detph) {
            int a = 1;
            for(int si : sins){
                a *= si;
            }
            int b = 0;
            for (int th : thn) {
                b += th;
            }

            minTotalPress = Math.min(minTotalPress, Math.abs(a - b));
        }else{
            for (int i = start; i < n; i++) {
                sins[detph] = sin[i];
                thn[detph] = sthum[i];

                combi(i + 1, detph + 1, max, sins, thn);
            }
        }
    }
}