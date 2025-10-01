import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int t = sc.nextInt(); int p = sc.nextInt();

        int[][] point = new int[n][t];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                point[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int count = n;
            for (int j = 0; j < n; j++) {
                if(point[j][i] == 1) count--;
            }
            arr[i] = count;
        }
        List<info> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int solve = 0;
            int toTla = 0;
            for (int j = 0; j < t; j++) {
                if (point[i][j] == 1) {
                    solve++;
                    toTla += arr[j];
                }
            }
            list.add(new info(solve,toTla));
        }

        info info = list.get(p - 1);
        int rank = 1;
        for (int i = 0; i < list.size(); i++) {
            if(i == p -1) continue;

            info info1 = list.get(i);
            if (info1.point > info.point) {
                rank++;
            } else if (info1.point == info.point) {
                if (info1.solve > info.solve) {
                    rank++;
                } else if (info1.solve == info.solve) {
                    if (p - 1 > i) {
                        rank++;
                    }
                }
            }

        }
        System.out.println(info.point + " " + rank);
    }
}
class info{
    int solve;
    int point;
    public info(int solve, int point) {
        this.point = point;
        this.solve = solve;
    }
}