import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();

        char[][] movie = new char[n][m];
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String site = sc.nextLine();
            for (int j = 0; j < m; j++) {
                movie[i][j] = site.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m - k; j++) {
                boolean ok = true;
                for (int a = j; a < j + k; a++) {
                    if(movie[i][a] == '1'){
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
