import java.sql.ClientInfoStatus;
import java.util.*;

class Main {
    static int[][] board;
    static int[][] origin;
    static List<int[]> temp;
    static boolean end = true;

    static int Size = 0;
    static int n, m, d;
    static boolean[][] che;
    static List<int[]> removePoint;
    static int max = -1;

    static List<int[]> teacher;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[] visited;

    static List<int[]> start;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String[] split = s.split("-");

        int answer = 0;


        answer = check(split[0]);
        for (int i = 1; i < split.length; i++) {
            int aSum = check(split[i]);

            answer -= aSum;
        }

        if (split.length == 1) {
            answer = check(split[0]);
        }

        System.out.println(answer);
        // 55-40+30-20+30;



    }

    static int check(String s) {
        String[] split = s.split("\\+");
        int sum = 0;

        for (String ss : split) {
            sum += Integer.parseInt(ss);
        }

        return sum;
    }
}