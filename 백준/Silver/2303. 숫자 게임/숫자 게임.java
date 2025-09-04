import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int ab = -3;
        int find = -1;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[5];
            for (int j = 0; j < 5; j++) {
                arr[j] = sc.nextInt();
            }
            int max = -1;
            for (int a = 0; a < 5; a++) {
                for (int b = a + 1; b < 5; b++) {
                    for (int c = b + 1; c < 5; c++) {
                        int nn = get(arr[a] + arr[b] + arr[c]);
                        max = Math.max(nn, max);
                    }
                }
            }
            if(ab <= max){
                ab = max;
                find = i + 1;
            }
        }
        System.out.println(find);
    }

    static int get(int a) {
        while (a >= 10) {
            a %= 10;
        }
        return a;
    }
}
