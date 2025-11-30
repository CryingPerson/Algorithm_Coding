import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] time = new int[getTime(2200) + 1];


        for (int i = 0; i < n; i++) {
            int start = sc.nextInt(); int end = sc.nextInt();

            int s = getTime(start) - 10;
            int e = getTime(end) + 10;

            s = Math.max(getTime(1000), s);
            e = Math.min(getTime(2200), e);

            for (int j = s ; j < e; j++) {
                time[j]++;
            }
        }

        int count = 0;
        int max = 0;
        for (int i = getTime(1000); i < getTime(2200); i++) {
            if(time[i] == 0){
                count++;
            } else if (time[i] != 0) {
                max = Math.max(max, count);
                count = 0;
            }
        }

        System.out.println(Math.max(max, count));
    }

    static int getTime(int num) {
        int hour = num / 100;
        int tiem = num % 100;

        return hour * 60 + tiem;
    }
}
