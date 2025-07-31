import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
       
            String line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            StringTokenizer st = new StringTokenizer(line);

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int max1 = -1;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                max1 = Math.max(max1, Integer.parseInt(st.nextToken()));
            }

            int max2 = -1;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                max2 = Math.max(max2, Integer.parseInt(st.nextToken()));
            }

            if (max1 == max2) {
                System.out.println("S");
            } else if (max1 > max2) {
                System.out.println("S");
            } else {
                System.out.println("B");
            }
        }
    }
}
