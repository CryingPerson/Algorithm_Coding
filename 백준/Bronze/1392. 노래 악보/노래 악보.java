import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); int Q = sc.nextInt();

        int[] sigin = new int[10000];

        int idx = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();

            for (int j = 0; j < a; j++) {
                sigin[idx] = i + 1;
                idx++;
            }
        }
        for (int i = 0; i < Q; i++) {
            int num = sc.nextInt();
            System.out.println(sigin[num]);
        }
    }
}
