import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }
        if(n == 1){
            System.out.println(1);
            return;
        }
        int max = Integer.MIN_VALUE;
        int inc = 1;
        int dec = 1;

        for (int i = 1; i < ans.length; i++) {
            if(ans[i] <= ans[i-1]){
                inc++;
            }else{
                inc = 1;
            }

            if(ans[i] >= ans[i-1]){
                dec++;
            }else{
                dec = 1;
            }

            max = Math.max(dec, Math.max(max, inc));
        }
        System.out.println(max);
    }
}
