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

        String a1 = sc.nextLine(); String b1  =sc.nextLine();

        int at = get(a1);
        int bt = get(b1);

        if (at > bt) {
            int ans = bt + 86400 - at;
            String print = print(ans);
            System.out.println(print);
        }else {
            if(bt - at == 0){
                System.out.println("24:00:00");
                return;
            }
            System.out.println(print(bt - at));
        }
    }

    static String print(int n) {
        int hour = n / 3600;
        int time = n % 3600 / 60;
        int se = n % 60;

        return String.format("%02d:%02d:%02d", hour, time, se);
    }

    // 61 610 6100 121
    // 28540
    static int get(String s) {
        String[] times = s.split(":");

        int hour = Integer.parseInt(times[0]) * 3600;
        int min = Integer.parseInt(times[1]) * 60;
        return hour + min + Integer.parseInt(times[2]);
    }
}