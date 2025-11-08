import java.util.*;

public class Main {
    static char[][] grid = new char[10][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long find = sc.nextLong();

        long[] arr = new long[n];

        long total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        if (total > find) {
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];

                if (sum > find) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }else{
            long sum = find - total;
            long oo = 0;

            for (int i = n - 1; i >= 0; i--) {
                oo += arr[i];
                if(oo >= sum){
                    System.out.println(i + 1);
                    return;
                }
            }
        }
    }
}
