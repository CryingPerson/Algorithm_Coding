import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] bots = new int[n][2];
        for (int i = 0; i < n; i++) {
            bots[i][0] = sc.nextInt();
            bots[i][1] = sc.nextInt();
        }

        int time = 0;

        for (int i = 0; i < n; i++) {
            int a = bots[i][0];
            int b = bots[i][1];

            int num = (a + b);

            if(time % num < b){
                time += b - (time % num);
            }

            time += 1;
        }

        System.out.println(time);
    }
}
