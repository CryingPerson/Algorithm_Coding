import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = n / 14;
        int y = n % 14;

        if (y == 1 || y == 13) {
            System.out.println("baby");
        } else if (y == 2 || y == 0) {
            System.out.println("sukhwan");
        } else if (y == 5) {
            System.out.println("very");
        } else if (y == 6) {
            System.out.println("cute");
        } else if (y == 9) {
            System.out.println("in");
        } else if (y == 10) {
            System.out.println("bed");
        } else {
            if (y == 3 || y == 7 || y == 11) {
                StringBuilder s = new StringBuilder("tururu");
                int cnt = 2;
                for (int i = 0; i < x; i++) {
                    s.append("ru");
                    cnt++;
                }
                if (cnt >= 5) {
                    s = new StringBuilder("tu+ru*" + cnt);
                }
                System.out.println(s);
                return;
            } else {
                StringBuilder ss = new StringBuilder("turu");
                int cnt = 1;
                for (int i = 0; i < x; i++) {
                    ss.append("ru");
                    cnt++;
                }
                if (cnt >= 5) {
                    ss = new StringBuilder("tu+ru*" + cnt);
                }
                System.out.println(ss);
                return;
            }
        }
    }
}
