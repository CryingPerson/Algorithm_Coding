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

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int nn = sc.nextInt();
            char[][] temp = new char[nn][nn];
            for(int j = 0; j < nn; j++) Arrays.fill(temp[j],'J');

            for (int j = 0; j < nn; j++) {
                temp[j][0] = '#';
                temp[0][j] = '#';
                temp[j][nn - 1] = '#';
                temp[nn - 1][j] = '#';
            }
            for (int j = 0; j < nn; j++) {
                for (int k = 0; k < nn; k++) {
                    sb.append(temp[j][k]);
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}