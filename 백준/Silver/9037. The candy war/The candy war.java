import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();

            if(n == 1){
                System.out.println(0);
                int ss = sc.nextInt();
                continue;
            }
            int[] arr = new int[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                if (num % 2 != 0) {
                    num++;
                }
                arr[j] = num;
            }
            boolean ss = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] != arr[j + 1]) {
                    ss = true;
                }
            }
            if (!ss) {
                System.out.println(0);
                continue;
            }
            while (true) {
                boolean ok = false;
                List<Integer>list = new ArrayList<>();
                for (int j = 0; j < arr.length; j++) {
                    list.add(arr[j] / 2);
                    arr[j] /= 2;
                }
                for (int j = 0; j < arr.length; j++) {
                    arr[(j + 1) % n] += list.get(j);
                }

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] % 2 != 0) {
                        arr[j]++;
                    }
                }
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] != arr[j + 1]) {
                        ok = true;
                        break;
                    }
                }
                count++;
                if (!ok) {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
