import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt(); int m = sc.nextInt(); int L = sc.nextInt();

        int[] arr = new int[N];

        int pos = 0;
        int cnt = 0;
        while (true){
            arr[pos]++;
            if(arr[pos] == m) break;
            if(arr[pos] % 2 ==0){
                pos = (pos - L + N) % N;
            }else{
                pos = (pos + L + N) % N;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
