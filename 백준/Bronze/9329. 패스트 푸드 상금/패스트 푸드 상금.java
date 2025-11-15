import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); int k =sc.nextInt();

            int[][] arr = new int[n][];
            List<Integer> priceSavePlace = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                int stikerNum = sc.nextInt();
                arr[j] = new int[stikerNum];
                for (int a = 0; a < stikerNum; a++) {
                    int require = sc.nextInt();

                    arr[j][a] = require;
                }
                int curPirce = sc.nextInt();
                priceSavePlace.add(curPirce);
            }
            int[] meSave = new int[k];
            for (int j = 0; j < k; j++) {
                int num = sc.nextInt();
                meSave[j] = num;
            }

            int sum=  0;
            for (int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int a = 0; a < arr[j].length; a++) {
                    min = Math.min(min, meSave[arr[j][a] - 1]);
                }
                sum += min * priceSavePlace.get(j);
            }
            System.out.println(sum);
        }

    }
}
