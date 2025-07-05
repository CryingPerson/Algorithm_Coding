import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a = 0;
        int b = 0;
        int aSum = 0;
        int bSum = 0;
        int curTime = 0;
        for(int i  = 0; i < N; i++) {
            int team = sc.nextInt();
            int time = get(sc.next());

            if(a > b){
                aSum += time - curTime;
            }else if(b > a){
                bSum += time - curTime;
            }

            if(team == 1) a++;
            else if(team == 2) b++;

            curTime = time;
        }
        if(a > b){
            aSum += 2880 - curTime;
        }else if(b > a){
            bSum += 2880 - curTime;
        }
        System.out.println(get(aSum));
        System.out.println(get(bSum));
    }
    static String get(int num) {
        int hour = num / 60;
        int min = num % 60;

        return String.format("%02d:%02d", hour, min);
    }
    static int get(String s) {
        String[] st = s.split(":");
        int hour = Integer.parseInt(st[0]);
        int min = Integer.parseInt(st[1]);

        return hour * 60 + min;
    }
}
