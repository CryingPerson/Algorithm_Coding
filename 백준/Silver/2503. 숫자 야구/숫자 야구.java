import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n;
    static int[] ans;
    static int[][] board;
    static int[][] talk;
    static Set<String> list = new HashSet<>();

    static long[] save = new long[9000001];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<info> list1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();

            list1.add(new info(num, strike, ball));
        }

        int sum = 0;
        for (int i = 123; i <= 987; i++) {

            if(!valid(i))continue;

            boolean flag = true;
            for(info list : list1){
                if(!compare(list, i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sum++;
            }

        }
        System.out.println(sum);
    }
    public static boolean compare(info info, int i) {
        int one = info.num / 100;
        int two = info.num / 10 % 10;
        int three = info.num % 10;

        int preOne = i / 100;
        int preTwo = i / 10 % 10;
        int preThree = i % 10;

        int str = 0;
        int bal = 0;

        if(one == preOne){
            str++;
        }else{
            if(one == preTwo || one == preThree){
                bal++;
            }
        }

        if(two == preTwo){
            str++;
        }else{
            if(two == preOne || two == preThree){
                bal++;
            }
        }

        if(three == preThree){
            str++;
        }else{
            if(three == preTwo || three == preOne){
                bal++;
            }
        }

        if(info.strike == str && info.ball == bal){
            return true;
        }
        return false;

    }

    public static boolean valid(int n) {
        int one = n / 100;
        int two = n / 10 % 10;
        int three = n % 10;

        return one != 0 && two != 0 && three != 0 && (one != two && two != three && three != one);
    }
}
class info{
    int num; int strike;int ball;
    public info(int num, int strike, int ball) {
        this.num = num;
        this.strike = strike;
        this.ball = ball;
    }
}