import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int t = 0;

        int[][] traffic = new int[N1][3];
        for(int i = 0; i < N1; i++) {
            traffic[i][0] = sc.nextInt();
            traffic[i][1] = sc.nextInt();
            traffic[i][2] = sc.nextInt();
        }

        int pos = 0;
        int idx = 0;
        while (pos < N2) {
            if(idx < N1 && pos == traffic[idx][0]) {
                int Sumtime = traffic[idx][1] + traffic[idx][2];

                int cur = t % Sumtime;
                if(cur < traffic[idx][1]){
                    t += traffic[idx][1] - cur;
                }
                idx++;
            }
            pos++;
            t++;
        }

        System.out.println(t);

    }
}