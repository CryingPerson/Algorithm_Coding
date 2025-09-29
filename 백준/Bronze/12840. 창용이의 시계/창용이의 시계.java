import java.io.IOException;
import java.util.*;

class Main {
    static char[][] board;

    static String[] months = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();

        int q = sc.nextInt();

        int cur = get(h, t, s);
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String lines[] = sc.nextLine().split(" ");
            if (lines.length > 1) {
                int tt = Integer.parseInt(lines[0]);
                int c = Integer.parseInt(lines[1]);
                if (tt == 1) {
                    cur += c;
                    cur %= 86400;
                } else {
                    cur -= c;
                    cur %= 86400;
                }
            } else {
                if (cur < 0) {
                    cur += 86400;
                }
                print(cur);
            }
        }
    }

    static void print(int s) {
        int hour = -1;
        int tiem = -1;
        int sss = -1;
        hour = s / 3600;
        tiem = (s % 3600) / 60;
        sss = s % 60;
        System.out.println(hour + " " + tiem + " " + sss);
    }

    static int get(int h, int t, int s) {
        return h * 3600 + t * 60 + s;
    }
}