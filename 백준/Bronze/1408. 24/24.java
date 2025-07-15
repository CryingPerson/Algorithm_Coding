import java.util.*;

public class Main {
    static char[][] DNA = {{'A', 'C', 'A', 'G'}, {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'}, {'G', 'A', 'G', 'T'}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String curTime = sc.nextLine();
        String startTime = sc.nextLine();

        int wholeTime = getTime("24");

        int findTime = 0;
        if(getTime(startTime) > getTime(curTime)){
            findTime = wholeTime - (wholeTime - getTime(startTime) + getTime(curTime));
        }else{
            findTime = wholeTime - (getTime(curTime) - getTime(startTime));
        }


        String ss = converse(findTime);
//
//

        System.out.println(ss);
    }

    static String converse(int n) {
        int hour = n / 3600;
        int time = 0;
        int sceond = 0;
        if (hour == 0) {
            time = n / 60;
            sceond = n % 60;
        } else {

            time = (n % 3600) / 60;

            sceond = (n % 3600) % 60;
        }

        return String.format("%02d:%02d:%02d", hour, time, sceond);
    }

    static int getTime(String n) {
        String[] split = n.split(":");
        if (n.length() <= 2) {
            int hour = Integer.parseInt(split[0]) * 3600;
            return hour;
        }
        int hour = Integer.parseInt(split[0]) * 3600;
        int time = Integer.parseInt(split[1]) * 60;
        int second = Integer.parseInt(split[2]);

        return hour + time + second;
    }
}
