import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); long k = sc.nextInt();

        long[] arr = new long[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextLong();

        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i+1]){
                arr[i+1] += k;
                if(arr[i] >= arr[i+1]) {
                    System.out.println(-1);
                    return;
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}