import java.util.*;

public class Main {
    static String[][] time;
    static String[] st = {"TTT","TTH","THT","THH","HTT","HTH","HHT","HHH"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        int curTIme = 30;
        while (idx < arr.length) {
            int time = arr[idx];
            curTIme = 30;
            while (curTIme > 0 && idx < arr.length) {
                if(curTIme >= time / 2.0) cnt++;
                curTIme -= time;
                idx++;
                if(idx < arr.length && curTIme > 0){
                    time = arr[idx];
                }
            }
        }
        System.out.println(cnt);
    }
}
