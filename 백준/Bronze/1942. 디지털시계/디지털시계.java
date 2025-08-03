import javax.crypto.spec.PSource;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int mmii = Integer.MAX_VALUE;
    static List<int[]> answer;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String[] times = sc.nextLine().split(" ");

            String startTime = times[0];
            String endTime = times[1];

            int count = simulation(startTime, endTime);

            System.out.println(count);
        }
    }

    static int simulation(String startTime, String endTime) {
        int time = get(startTime);
        int end = get(endTime);

        if(time > end){
            end += 24 * 3600;
        }
        int cnt = 0;
        for (int i = time; i <= end; i++) {
            int h = (i / 3600) % 24;
            int t = (i / 60) % 60;
            int s = i % 60;

            int clonint = h * 10000 + t * 100 + s;

            if(clonint % 3 == 0) cnt++;
        }
        return cnt;
    }

    static int get(String s) {
        String[] split = s.split(":");
        int hour = 3600 * Integer.parseInt(split[0]);
        int min = 60 * Integer.parseInt(split[1]);
        int sec = Integer.parseInt(split[2]);

        return hour + min + sec;
    }
}