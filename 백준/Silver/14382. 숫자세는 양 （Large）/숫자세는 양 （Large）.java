import java.util.*;

public class Main {
    static char[] arr = {'A', 'B', 'C', 'D'};
    static int L = 2;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Set<String> set = new HashSet<>();
    static StringBuffer sb = new StringBuffer();
    static int[][] board;
    static int max = 0;
    static List<int[]> list = new ArrayList<>();
    static List<int[]> viruous = new ArrayList<>();
    static int n, m;
    static int[] number;
    static int mins = Integer.MAX_VALUE;
    static int total = 0;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            int save = num;
            int [] number = new int[10];
            if (num == 0) {
                sb.append("Case #");
                sb.append(i + 1);
                sb.append(": INSOMNIA").append("\n");
            }else{
                int plus = 1;
                while (true) {
                    num = save * plus;
                    while (num > 0) {
                        int point = num % 10;
                        number[point]++;
                        num /= 10;
                    }

                    boolean end = check(number);
                    if(end) break;
                    plus++;
                }
                sb.append("Case #");
                sb.append(i + 1);
                sb.append(": ");
                sb.append(save * plus).append("\n");

            }
        }
        System.out.println(sb);
    }

    static boolean check(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if(number[i] == 0) return false;
        }
        return true;
    }
}