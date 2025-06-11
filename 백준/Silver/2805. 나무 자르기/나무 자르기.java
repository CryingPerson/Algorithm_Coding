import java.util.*;

public class Main {
    static int[] arr;
    static int[] ans;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); int M = sc.nextInt();

        int[] arr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            int heigh = sc.nextInt();

            arr[i] = heigh;
            max = Math.max(heigh, max);
        }

        int left = 0;
        int right = max;

        long temp = 0;
        int ans = 0;
        while (left <= right) {
            temp = 0;
            int mid = (left + right)/2;

            for (int x : arr) {
                if(mid < x){
                    temp += x - mid;
                }
            }

            if (temp >= M) {
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
