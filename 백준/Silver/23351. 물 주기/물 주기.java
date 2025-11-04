import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[]arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int a = sc.nextInt(); int b = sc.nextInt();

        arr = new int[n];

        Arrays.fill(arr, m);

        int day = 1;
        int start = 0;
        while (true) {

            for (int i = start; i < start + a; i++) {
                spay((i % n), a, b);
            }
            decrease();
            if(check()){
                break;
            }
            day++;
            start += a;
        }
        System.out.println(day);

        // 3 3 3 3 3 3
        // 3 3 2 2 2 2
        // 2 2 2 2 1 1
        // 1 1 1 1 1 1
        // 1 1 0 0 0 0

        // 2 2 2 2 2 2
        // 2 1 1 1 1 1
        // 1 1 0 0 0 0

    }

    static boolean check() {
        for(int x : arr){
            if(x == 0) return true;
        }
        return false;
    }

    static void decrease() {
        for (int i = 0; i < arr.length; i++) {
            arr[i]--;
        }
    }

    static void spay(int point, int consis, int plus) {
        arr[point] += plus;
    }
}