import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int aaaasd = 0;
    static boolean[][] check;
    static String[][] st = {{".",".",".","."}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st2 = {{"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st3 = {{"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}, {".",".",".","."}};
    static String[][] st4 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {".",".",".","."}};
    static String[][] st5 = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] require = new int[n * 2];
        boolean[] robots = new boolean[n * 2];

        for (int i = 0; i < require.length; i++) {
            require[i] = sc.nextInt();
        }

        int cnt = 0;

        while (true) {

            cnt++;
            circle(require, robots, n);
            move(require, robots, n);

            if (require[0] > 0) {
                require[0]--;
                robots[0] = true;
            }

            if(check(require) >= k){
                System.out.println(cnt);
                return;
            }
        }
    }

    static int check(int[] arr) {
        int d = 0;
        for(int x : arr) if(x == 0) d++;
        return d;
    }

    static void move(int[] re, boolean[] ro, int n) {
        for (int i = n - 2; i >= 0; i--) {
            if (ro[i] && !ro[i + 1] && re[i + 1] > 0) {
                ro[i+1] = true;
                ro[i] = false;
                re[i + 1]--;
            }
        }
        ro[n - 1] = false;
    }

    static void circle(int[] re, boolean[] ro, int n) {
        int last = re[re.length - 1];

        for (int i = re.length - 1; i > 0; i--) {
            re[i] = re[i - 1];
            ro[i] = ro[i - 1];
        }
        re[0] = last;

        boolean lastRo = ro[ro.length - 1];

        ro[0] = lastRo;

        ro[n - 1] = false;
    }
}
