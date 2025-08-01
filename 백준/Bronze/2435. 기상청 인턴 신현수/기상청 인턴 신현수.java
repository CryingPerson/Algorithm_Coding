import java.math.BigInteger;
import java.util.*;

public class Main {
    static int mmii = Integer.MAX_VALUE;
    static List<int[]> answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        int left = 0;
        int sum = 0;
        int size = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < arr.length; right++) {
            if(size == k){
                max = Math.max(max, sum);
                sum -= arr[left];
                size--;
                left++;
            }
            sum += arr[right];
            size++;
        }
        max = Math.max(max, sum);
        System.out.println(max);
    }
}