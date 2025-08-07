import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        final int DAY_START = toMinute("07:00");
        final int DAY_END = toMinute("18:59");

        int total = 0;

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            int start = toMinute(parts[0]);
            int duration = Integer.parseInt(parts[1]);

            for (int j = 0; j < duration; j++) {
                int curTime = start + j;
                if (DAY_START <= curTime && curTime <= DAY_END) {
                    total += 10;
                } else {
                    total += 5;
                }
            }
        }

        System.out.println(total);
    }

    static int toMinute(String hhmm) {
        String[] parts = hhmm.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
