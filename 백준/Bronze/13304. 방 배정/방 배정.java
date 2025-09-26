import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static char[] Adrian = {'A', 'B', 'C'};
    static char[] Bruno = {'B', 'A', 'B', 'C'};
    static char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

    static int[] fibos;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();

        int[][] student = new int[6][2];

        for (int i = 0; i < n; i++) {
            int soung = sc.nextInt(); int grade = sc.nextInt() - 1;
            if (soung == 0) {
                student[grade][soung]++;
            }else student[grade][soung]++;
        }

        int count = 0;

        int cnt = 0;
        for (int i = 0; i < 2; i++) {
            cnt += student[i][0];
            cnt += student[i][1];
        }
        count += cnt / k + cnt % k;

        int idx = 0;
        for (int i = 2; i < 4; i++) {
            cnt = 0;
            for (int j = 0; j < 2; j++) {
                cnt += student[i][j];
            }
            count += cnt / k;
            count += cnt % k;
        }
        idx = 0;
        for (int i = 4; i < 6; i++) {
            cnt = 0;
            for (int j = 0; j < 2; j++) {
                cnt += student[i][j];
            }
            count += cnt / k + cnt % k;
        }
        System.out.println(count);
    }
}