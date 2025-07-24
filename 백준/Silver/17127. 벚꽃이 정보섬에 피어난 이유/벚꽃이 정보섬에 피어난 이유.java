import java.util.*;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

         arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        int p1 = sum(a, b-1);
                        int p2 = sum(b, c-1);
                        int p3 = sum(c, d-1);
                        int p4 = sum(d, n-1);

                        max = Math.max(p1+p2+p3+p4, max);
                    }
                }
            }
        }
        System.out.println(max);
    }

    static int sum(int start, int end) {
        int sum = 1;
        for (int i = start; i <= end; i++) {
            sum *= arr[i];

        }
        return sum;
    }

}
