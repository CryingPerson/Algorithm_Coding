import java.util.*;
class Main {
    static int[] dx = {-1, 0 ,1 , 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] game;
    static List<int[]> dis = new ArrayList();
    static int goalX;
    static int goalY;
    static int cnt = 0;
    static int dir = 0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if(i == 0){
                    A[j] = sc.nextInt();
                }else{
                    B[j] = sc.nextInt();
                }
            }
        }

        int aWin = 0; int bWin = 0;

        int idx = 0;
        for (int x : A) {
            if(B[idx] < x) aWin++;
            else if(B[idx] > x) bWin++;

            idx++;
        }

        String ans = (aWin == bWin) ? "D" : (aWin > bWin) ? "A" : "B";

        System.out.println(ans);
    }
}