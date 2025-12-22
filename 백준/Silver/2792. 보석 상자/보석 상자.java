import java.util.*;
class Main {
    static int min = Integer.MAX_VALUE;

    static int hihi = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();

        int[] arr = new int[m];

        for(int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
            hihi = Math.max(hihi, arr[i]);
        }

        seach(n,arr);

        System.out.println(min);
    }

    static void seach(int find, int[] arr) {
        int left = 1;
        int right = hihi;

        while (left <= right) {
            int mid = (left + right) / 2;

            int total = 0;
            for (int x : arr) {
                total += x / mid;
                if(x % mid != 0) total++;
            }

            if (total <= find) {
                min = Math.min(min, mid);
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
    }
}