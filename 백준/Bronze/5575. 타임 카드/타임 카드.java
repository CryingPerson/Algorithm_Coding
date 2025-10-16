import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String[] times = sc.nextLine().split(" ");

            int aTime = Integer.parseInt(times[0]) * 3600 + Integer.parseInt(times[1]) * 60 + Integer.parseInt(times[2]);

            int bTine = Integer.parseInt(times[3]) * 3600 + Integer.parseInt(times[4]) * 60 + Integer.parseInt(times[5]);

            int total = bTine - aTime;

            int hour = total / 3600;
            int time = (total % 3600) / 60;
            int se = (total % 3600) % 60;

            System.out.println(hour + " " + time + " " + se);
                    // 3800
                    // 3600 = 1 200 60
        }
    }
}