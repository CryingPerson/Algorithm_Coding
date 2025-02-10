
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int max = Math.max(k, Math.max(n, m));
            if (n == 0 && m == 0 && k == 0) break;
            if (max == n) {
                if (Math.pow(k, 2) + Math.pow(m, 2) == Math.pow(n, 2)) System.out.println("right");
                else System.out.println("wrong");
            } else if (max == m) {
                if (Math.pow(k, 2) + Math.pow(n, 2) == Math.pow(m, 2)) System.out.println("right");
                else System.out.println("wrong");
            } else if (max == k) {
                if (Math.pow(m, 2) + Math.pow(n, 2) == Math.pow(k, 2)) System.out.println("right");
                else System.out.println("wrong");
            }

        }
    }
}