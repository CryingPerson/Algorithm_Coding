import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int mon = sc.nextInt(); int date = sc.nextInt();

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int total = 0;
        for (int i = 0; i < mon - 1; i++) {
            total += monthDays[i];
        }

        total += date;

        System.out.println(days[total % 7]);
    }

}