import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0}; // 위, 오른, 아래, 왼 (x는 행)
    static int[] dy = {0, 1, 0, -1}; // 위, 오른, 아래, 왼 (y는 열)
    static int N, targetX, targetY;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int T = sc.nextInt();
            int sum = 0;
            double totalGrade= 0;
            for(int j = 0; j < T; j++){
                int sumScore = sc.nextInt();
                double receiveScore = sc.nextDouble();

                sum += sumScore;
                totalGrade += receiveScore*sumScore;
            }
            System.out.print(sum+ " ");
            System.out.printf("%.1f\n", totalGrade/ sum);
        }

    }
}
