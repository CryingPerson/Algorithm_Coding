import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = { "Thursday", "Friday", "Saturday", "Sunday","Monday", "Tuesday", "Wednesday"};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] starTime = sc.nextLine().split(" ");
        String[] endTime = sc.nextLine().split(" ");

        int stratHour = Integer.parseInt(starTime[0]);
        int startMin = Integer.parseInt(starTime[1]);

        int endHour = Integer.parseInt(endTime[0]);
        int endMin = Integer.parseInt(endTime[1]);


        int n = sc.nextInt();

        int count = 0;

        int getA = get(stratHour, startMin);
        int getB = get(endHour, endMin);

        for (int i = getA; i <= getB; i++) {
            String fo = print(i);
            if(fo.contains(String.valueOf(n))) count++;
        }
        System.out.println(count);
    }

    static String print(int i) {
        int hour = i / 60;
        int time = i % 60;

        return String.format("%02d%02d", hour, time);
    }

    static int get(int hour, int min) {
        return hour * 60 + min;
    }
}