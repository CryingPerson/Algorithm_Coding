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

        int n = sc.nextInt();

        List<Integer> result = new ArrayList<>();


        List<int[]> think = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt(); int strike = sc.nextInt(); int ball = sc.nextInt();

            think.add(new int[]{num, strike, ball});
        }

        for (int i = 100; i <= 999; i++) {
            if(check(i)) continue;
            if(String.valueOf(i).contains("0")) continue;
            boolean ok = true;
            for(int[] numbers : think){
                int number = numbers[0];
                int strike = numbers[1];
                int balll = numbers[2];

                if(check2(i, number, strike, balll)){

                }else{
                    ok = false;
                    break;
                }
            }

            if(ok) result.add(i);
        }
        System.out.println(result.size());
    }

    static boolean check2(int predict, int nn, int sCount, int bCount) {
        String a1 = String.valueOf(predict);
        String a2 = String.valueOf(nn);

        int c1 = 0;
        int b1 = 0;

        for (int i = 0; i < a1.length(); i++) {
            if(a1.charAt(i) == a2.charAt(i)) c1++;
        }

        for (int i = 0; i < a1.length(); i++) {
            if(a1.charAt(i) != a2.charAt(i)){
                if(a2.contains(String.valueOf(a1.charAt(i)))){
                    b1++;
                }
            }
        }

        if(c1 == sCount && b1 == bCount) return true;

        return false;
    }

    static boolean check(int num) {
        String aa = String.valueOf(num);

        if(aa.charAt(0) == aa.charAt(1) || aa.charAt(0) == aa.charAt(2) || aa.charAt(1) == aa.charAt(2)) return true;

        return false;
    }
}