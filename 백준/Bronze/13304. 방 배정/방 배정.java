import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();

        int[][] student = new int[7][2];
        for (int i = 0; i < n; i++) {
            int sex = sc.nextInt(); int grade = sc.nextInt();

            student[grade][sex]++;
        }

        int requierRoom = 0;
        int sum = 0;

        sum += student[1][0] + student[1][1] + student[2][1] + student[2][0];

        requierRoom += sum / k;
        if(sum % k != 0) requierRoom++;


        for (int i = 3; i <= 6; i += 2) {
            int gril = 0;
            int man = 0;

            gril += student[i][0] + student[i + 1][0];
            man += student[i][1] + student[i + 1][1];

            requierRoom += gril/ k + man / k;
            if(gril % k != 0) requierRoom++;
            if(man % k != 0) requierRoom++;

        }
        System.out.println(requierRoom);
    }
}
