import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        double max = -1;
        int ower = -1;
        for (int i = 0; i < 3; i++) {
            int price = sc.nextInt(); int weigh = sc.nextInt();

            double s = 0;

            int sum = price * 10;
            if(sum >= 5000){
                sum -= 500;
            }

            s = (double) (weigh * 10) / sum ;
            if (max < s) {
                max = s;
                ower = i + 1;
            }

        }

        String asnswer = "";

        asnswer = ower == 1 ? "S" : ower == 2 ? "N" : "U";
        System.out.println(asnswer);

    }
}