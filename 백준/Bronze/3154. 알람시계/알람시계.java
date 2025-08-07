import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[][] time;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        time = new String[][]{{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"", "0", ""}};
        String[] times = sc.nextLine().split(":");

        int hour = Integer.parseInt(times[0]);
        int ti = Integer.parseInt(times[1]);

        String save1 = "";
        String save2 = "";
        for (int i = 0; i < 100; i += 24) {
            int hoursss = hour;
            if(i + hoursss >= 100)continue;
            for (int j = 0; j < 100; j += 60) {
                int minuess = ti;
                if(j + minuess >= 100) continue;

                int i1 = get(String.valueOf(hoursss + i), String.valueOf(minuess + j));
                if(min > i1){
                    min = i1;
                    save1 = String.valueOf(hoursss + i);
                    save2 = String.valueOf(minuess + j);
                }
            }
        }
        String print = print(save1, save2);
        System.out.println(print);
    }

    static String print(String save1, String save2) {
        int a = Integer.parseInt(save1);
        int b= Integer.parseInt(save2);
        String format = String.format("%02d:%02d", a, b);

        return format;
    }

    static int get(String hour, String time) {
        hour = String.format("%02d", Integer.parseInt(hour));
        time = String.format("%02d", Integer.parseInt(time));
        String total = hour + time;

        int cnt = 0;
        for (int i = 0; i <= total.length() -2; i++) {
            String s = total.substring(i, i+2);

            int simual = simual(s);

            cnt += simual;
        }

        return cnt;
    }

    static int simual(String s) {
        String fi = String.valueOf(s.charAt(0));
        String ti = String.valueOf(s.charAt(1));

        int x1 = -1;
        int y1 = -1;

        int x2 = -1;
        int y2 = -1;

        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < time[0].length; j++) {
                if(time[i][j].equals(fi)){
                    x1 = i;
                    y1 = j;
                }if(time[i][j].equals(ti)){
                    x2 = i;
                    y2 = j;
                }
            }
        }

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
