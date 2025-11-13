import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 10){
            System.out.println(n);
            return;
        }
        int count = 10;

        for (int i = 11; i <= n; i++) {
            String s = String.valueOf(i);

            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            if(i % sum == 0) count++;
        }
        System.out.println(count);




    }
}