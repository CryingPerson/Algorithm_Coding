import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int cnt = 0;
        while (N.length() > 1){
            cnt++;
            String s = N;
            int Num = check(s);
            N = String.valueOf(Num);
        }
        if(Integer.parseInt(N) % 3 == 0){
            System.out.println(cnt);
            System.out.println("YES");
            return;
        }
        System.out.println(cnt);
        System.out.println("NO");
    }
    static int check(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }
}
