import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] road = new int[100];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt(); int speed = sc.nextInt();
            for (int j = 0; j < length; j++) {
                road[idx] = speed;
                idx++;
            }
        }

        int idx2 = 0;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            int legth = sc.nextInt(); int speed = sc.nextInt();
            for (int j = idx2; j < idx2 + legth; j++) {
                if(road[j] < speed){
                    ans = Math.max(ans, speed - road[j]);
                }
            }
            idx2 += legth;
        }
        System.out.println(ans);

    }

}
