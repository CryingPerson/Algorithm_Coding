import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int M = sc.nextInt(); 

        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = N;
        int answer = N;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (canCoverAll(arr, N, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    static boolean canCoverAll(int[] arr, int N, int h) {
        // 앞 구간 커버 확인
        if (arr[0] - h > 0) return false;

        // 중간 구간 커버 확인
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 2 * h) return false;
        }

        // 마지막 구간 커버 확인
        if (arr[arr.length - 1] + h < N) return false;

        return true;
    }
}
