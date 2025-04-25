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
        int first = sc.nextInt();
        int min = Integer.MIN_VALUE;
        int sum = 0;
        boolean flag = true;
        for(int i = 1; i < n; i++) {
            int num = sc.nextInt();

            if(first < num && flag) {
                sum += num - first;
            }else if(first > num) {
                min = Math.max(min, sum);
                sum = 0;
                flag = true;
            }else{
                flag = false;
                sum = 0;
            }
            first = num;
        }
        min = Math.max(min, sum);
        System.out.println(min);
    }
}
