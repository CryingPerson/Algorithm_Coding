import java.util.*;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = sc.nextInt();

        int left = 0;
        int right = m;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            int place = sc.nextInt();

            if(right < place) {
                ans += place - right;
                right = place;
                left = place - m + 1;
            }else if(left > place) {
                ans += left - place;
                left = place;
                right = left + m - 1;
            }
        }
        System.out.println(ans);

    }
}
