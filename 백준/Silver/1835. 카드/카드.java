import java.io.*;
import java.util.*;

class Main {
    static int[][] board;
    static int[][] temp;
    static boolean[] visited;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int idx = n;
        Deque<Integer> dQ = new ArrayDeque<>();

        for (int i = n; i > 0; i--) {
            dQ.addFirst(i);
            for (int j = 0; j < idx; j++) {
                dQ.addFirst(dQ.removeLast());
            }
            idx--;
        }
        for (int x : dQ) {
            System.out.print(x + " ");
        }

    }
}
