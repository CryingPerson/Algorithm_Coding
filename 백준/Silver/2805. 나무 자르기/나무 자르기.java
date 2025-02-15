import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] board;

    static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxHeight = Math.max(arr[i], maxHeight);
        }

        int left = 0;
        int right = maxHeight;



        while (left <= right){
            int mid = (left + right)/2;
            long tmep = 0;
            for(int x : arr){
                if(x > mid){
                    tmep += x - mid;
                }
            }

            if(tmep >= m){
                result = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
