import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {  
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println("Jolly");
                continue;
            }

            boolean[] diff = new boolean[n]; 

            for (int i = 1; i < n; i++) {
                int d = Math.abs(arr[i] - arr[i - 1]);
                if (d >= 1 && d <= n - 1) {
                    diff[d] = true;
                }
            }

            boolean ok = true;
            for (int i = 1; i <= n - 1; i++) {
                if (!diff[i]) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "Jolly" : "Not jolly");
        }
    }
}
