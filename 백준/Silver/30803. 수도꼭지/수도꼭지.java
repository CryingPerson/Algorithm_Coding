import java.sql.ClientInfoStatus;
import java.util.*;

class Main {
    static String[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[]visited;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] Ai = new int[N];

        long start = 0;
        for(int i = 0; i < N; i++){
            Ai[i] = sc.nextInt();
            start += Ai[i];
        }

        int Q = sc.nextInt();

        boolean[] on = new boolean[N];
        Arrays.fill(on, true);
        StringBuilder sb = new StringBuilder();
        sb.append(start).append("\n");
        for (int j = 0; j < Q; j++) {
            int cmd = sc.nextInt();

            long sum = 0;
            if (cmd == 2) {
                int num = sc.nextInt();
                if(on[num - 1]){
                    on[num - 1] = false;
                    start -= Ai[num - 1];
                }else{
                    on[num - 1] = true;
                    start += Ai[num - 1];
                }
            }else{
                int sudo = sc.nextInt();
                int newNum = sc.nextInt();
                if(on[sudo - 1]){
                    start -= Ai[sudo - 1];
                    start += newNum;
                }
                Ai[sudo - 1] = newNum;
            }
            sb.append(start).append("\n");

        }
        System.out.println(sb);
    }
}