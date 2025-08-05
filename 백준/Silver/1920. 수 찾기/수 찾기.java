import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr = new int[3];
    static char[][] board;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int m = sc.nextInt();

        Arrays.sort(arr);
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();

            if(check(arr, num)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }

    static boolean check(int[] arr, int n) {
        int left = 0;
        int right = arr.length-1;

        int mid = -1;

        while (left <= right) {

            mid = (left + right) / 2;
            if(arr[mid] == n) return true;

            if(arr[mid] > n){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}