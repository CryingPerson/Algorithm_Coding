

import java.util.Scanner;

class Main {
    static int[][] memo; // 각 n에 대한 [0 호출 횟수, 1 호출 횟수] 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        memo = new int[41][2]; // 최대 40까지 계산 가능
        memo[0][0] = 1; // FIBO(0) -> 0이 1번 호출
        memo[0][1] = 0;
        memo[1][0] = 0;
        memo[1][1] = 1; // FIBO(1) -> 1이 1번 호출

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            FIBO(num); // 계산 수행
            System.out.println(memo[num][0] + " " + memo[num][1]);
        }
    }

    public static void FIBO(int n) {
       if(memo[n][0] != 0 || memo[n][1] != 0) return;

       FIBO(n-1);
       FIBO(n-2);

       memo[n][0] = memo[n-2][0] + memo[n-1][0];
       memo[n][1] = memo[n-2][1] + memo[n-1][1];
    }
}
