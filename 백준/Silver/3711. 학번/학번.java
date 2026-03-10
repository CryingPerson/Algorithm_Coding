import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static String s;
    static boolean[] hit;
    static int n;
    static HashSet<String> setString = new HashSet<>();

    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dx2 = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy2 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy= {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int g = sc.nextInt();
            int[] save = new int[g];
            for (int j = 0; j < g; j++) {
                int gradeNum = sc.nextInt();

                save[j] = gradeNum;
            }

            int i1 = find(save);
            System.out.println(i1);
        }
    }

    static int find(int[] saev) {
        int num = 1;
        int[] visited = new int[1000000];
        while (true) {
            boolean end = true;
            for (int xx : saev) {
                if (visited[xx % num] == num) {
                    end = false;
                    break;
                }else visited[xx % num] = num;
            }
            if(end) return num;
            num++;
        }
    }
}
