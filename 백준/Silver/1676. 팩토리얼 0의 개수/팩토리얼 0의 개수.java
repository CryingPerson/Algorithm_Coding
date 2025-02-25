import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력 받기

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        String s = String.valueOf(factorial);
        int cnt = 0;
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) == '0'){
                cnt++;
            }else{
                System.out.println(cnt);
                break;
            }
        }
    }
}
