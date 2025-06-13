import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int sum = 0;
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int weigh = sc.nextInt();
            sum += weigh;
            if(sum == M){
                cnt++;
                sum = 0;
            }
            if(sum > M){
                cnt++;
                sum = weigh;
            }
        }
        if(sum != 0){
            cnt++;
        }
        System.out.println(cnt);
    }
}